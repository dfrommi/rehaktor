package io.github.dfrommi.rehaktor.generator.template

import com.squareup.kotlinpoet.ANY
import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.asClassName
import io.github.dfrommi.rehaktor.generator.metadata.Characteristic

class CharacteristicClassBuilder(
    private val packageName: String,
    private val characteristic: Characteristic
) {
    private val className = ClassName(packageName, characteristic.name.split(" ")
        .joinToString(separator = "", postfix = "Characteristic") {
            it.replace(".", "").capitalize()
        })

    private val enumClassName = className.nestedClass("Enum")

    private val valueType = when (characteristic.valueType) {
        Enum::class -> enumClassName
        else -> characteristic.valueType.asClassName()
    }

    fun build() = ClassSpec(
        className,
        TypeSpec.classBuilder(className).addModifiers(KModifier.OPEN)
            .withPrimaryConstructor()
            .withFixedValueConstructor()
            .withCharacteristicBaseClass()
            .withOptionalEnum()
            .build()
    )

    private fun TypeSpec.Builder.withPrimaryConstructor() = apply {
        val f = FunSpec.constructorBuilder()
        if (characteristic.isReadable) {
            if (characteristic.isObservable) {
                f.addParameter("values", valueType.asFlux())
            } else {
                f.addParameter("value", valueType)
            }
        }

        if (characteristic.isWritable) {
            f.addParameter("setter", LambdaTypeName.get(null, valueType, returnType = ANY.nullable()))
        }

        primaryConstructor(f.build())
    }

    private fun TypeSpec.Builder.withFixedValueConstructor() = apply {
        //nothing that can be set to a fixed value or it is already a fixed value
        if (!characteristic.isReadable || !characteristic.isObservable) return this

        val f = FunSpec.constructorBuilder()
            .addParameter("value", valueType)
        if (characteristic.isWritable)
            f.callThisConstructor(CodeBlock.of("%T.just(value)", Flux), CodeBlock.of("{}"))
        else
            f.callThisConstructor(CodeBlock.of("%T.just(value)", Flux))

        addFunction(f.build())
    }

    private fun TypeSpec.Builder.withCharacteristicBaseClass() = apply {
        this.superclass(when (characteristic.valueType) {
            String::class -> "String".characteristic()
            Boolean::class -> "Boolean".characteristic()
            Int::class -> "Integer".characteristic()
            Double::class -> "Double".characteristic()
            Enum::class -> "Enum".characteristic().parameterizedBy(enumClassName)
            ByteArray::class -> "Tlv".characteristic()
            else -> throw IllegalArgumentException("Type ${characteristic.valueType} not supported")
        })

        addSuperclassConstructorParameter("type=%S", characteristic.uuid)
        addSuperclassConstructorParameter("description=%S", characteristic.name)

        characteristic.constraints?.minimumValue?.let {
            addSuperclassConstructorParameter("minValue=%L", it.roundToValueType())
        }

        characteristic.constraints?.maximumValue?.let {
            addSuperclassConstructorParameter("maxValue=%L", it.roundToValueType())
        }

        characteristic.constraints?.stepValue?.let {
            addSuperclassConstructorParameter("minStep=%L", it.roundToValueType())
        }

        characteristic.unit?.let {
            addSuperclassConstructorParameter("unit=%L", ValueUnit(it))
        }

        if (characteristic.valueType == Int::class) {
            addSuperclassConstructorParameter("format=%L", Format(characteristic.format))
        }

        if (characteristic.hasFixedValues) {
            addSuperclassConstructorParameter("enumClass=Enum::class")
        }

        if (characteristic.isReadable) {
            if (characteristic.isObservable) {
                addSuperclassConstructorParameter("values=values")
            } else {
                addSuperclassConstructorParameter("values=%T.just(value)", Flux)
            }
        }

        if (characteristic.isWritable) {
            addSuperclassConstructorParameter("setter=setter")
        }

        addSuperclassConstructorParameter("isObservable=%L", characteristic.isObservable)
    }

    private fun TypeSpec.Builder.withOptionalEnum() = apply {
        val values = enumValues()

        if (values.isNotEmpty()) {
            val e = TypeSpec.enumBuilder("Enum").apply {
                values.forEach(::addEnumConstant)
            }

            if (values.count() == 2) {
                e.addFunction(FunSpec.builder("toBoolean")
                    .addStatement("return this == %N", values[1])
                    .build()
                )

                e.addType(TypeSpec.companionObjectBuilder()
                    .addFunction(
                        FunSpec.builder("from")
                            .addParameter("v", Boolean::class)
                            .addStatement("return if(v) %N else %N", values[1], values[0])
                            .build()
                    ).build())
            }

            this.addType(e.build())
        }
    }

    private fun enumValues(): List<String> {
        return characteristic.constraints?.validValues?.entries
            ?.sortedBy { it.key.toInt() }
            ?.mapIndexed { index, (code, value) ->
                require(index == code.toInt()) { "${characteristic.uuid}: index of '$value' is $code, but expected $index" }
                value.split(" ").joinToString("_") {
                    it
                        .replace("[,()]".toRegex(), "")
                        .replace("[.-]".toRegex(), "_")
                        .toUpperCase()
                }
            } ?: emptyList()
    }

    private fun String.characteristic() = ClassName("io.github.dfrommi.rehaktor.core", "${this}ReactiveCharacteristic")

    private fun Double.roundToValueType() = when (characteristic.valueType) {
        Int::class -> this.toInt()
        else -> this
    }
}

private val Flux = ClassName("reactor.core.publisher", "Flux")
private fun ClassName.asFlux() = Flux.parameterizedBy(this)

private fun ClassName.nullable() = this.copy(nullable = true)

private fun ValueUnit(name: String) = ClassName("io.github.dfrommi.rehaktor.core", "ValueUnit").member(name.toUpperCase())
private fun Format(name: String) = ClassName("io.github.dfrommi.rehaktor.core", "Format").member(name.toUpperCase())
