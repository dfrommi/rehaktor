package io.github.dfrommi.hapkt.generator.template

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier.OPEN
import com.squareup.kotlinpoet.KModifier.OVERRIDE
import com.squareup.kotlinpoet.KModifier.PRIVATE
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.UNIT
import com.squareup.kotlinpoet.asClassName
import io.github.dfrommi.hapkt.generator.metadata.Characteristic

class CharacteristicClassBuilder(
  private val packageName: String,
  private val characteristic: Characteristic
) {
  private val className = ClassName(packageName, characteristic.name.split(" ")
    .joinToString(separator = "", postfix = "") {
      it.replace(".", "").capitalize()
    })

  private val enumClassName = className.nestedClass("Value")

  private val valueType = when (characteristic.valueType) {
    Enum::class -> enumClassName
    else -> characteristic.valueType.asClassName()
  }

  private val commandType = LambdaTypeName.get(className, valueType, returnType = UNIT)

  fun build() = ClassSpec(
    className,
    TypeSpec.classBuilder(className).addModifiers(OPEN)
      .withCoreProperties()
      .withInterfaceImplementation()
      .withFixedValueConstructor()
      .withOptionalEnum()
      .build()
  )

  private fun TypeSpec.Builder.withInterfaceImplementation() = apply {
    val constructorBuilder = FunSpec.constructorBuilder()

    if (characteristic.isObservable) {
      addSuperinterface(Types.observableCharacteristicBaseInterface(characteristic.valueType, enumClassName))

      addConstructorProperty(constructorBuilder,
        ParameterSpec.builder("observableValue", Types.observableValue().parameterizedBy(valueType)).build(),
        PRIVATE
      )

      addProperty(
        PropertySpec.builder("value", valueType, OVERRIDE).mutable()
          .getter(FunSpec.getterBuilder()
            .addCode("return observableValue.get()").apply {
              if (characteristic.valueType == Int::class || characteristic.valueType == Double::class)
                addCode( ".truncated(range, step)")
            }.build()
          ).setter(
            FunSpec.setterBuilder().addParameter("value", valueType)
              .addCode("observableValue.set(value)")
              .build()
          ).build()
      )

      addFunction(
        FunSpec.builder("onValueChange").addModifiers(OVERRIDE)
          .addParameter("action", LambdaTypeName.get(null, valueType, returnType = UNIT))
          .addCode("observableValue.onChange(action)")
          .build()
      )

    } else if (characteristic.isReadable) { //Observable is also Readable
      addSuperinterface(Types.readableCharacteristicBaseInterface(characteristic.valueType, enumClassName))

      addConstructorProperty(constructorBuilder, ParameterSpec("value", valueType), OVERRIDE)
    }

    if (characteristic.isWritable) {
      addSuperinterface(Types.writableCharacteristicBaseInterface(characteristic.valueType, enumClassName))
      addConstructorProperty(constructorBuilder, ParameterSpec("command", commandType))

      addFunction(
        FunSpec.builder("execute").addModifiers(OVERRIDE)
          .addParameter("targetValue", valueType)
          .addCode("command.invoke(this, targetValue)")
          .build()
      )
    }

    primaryConstructor(constructorBuilder.build())
  }

  private fun TypeSpec.Builder.withCoreProperties() = apply {
    this.addProperty(
      PropertySpec.builder("type", String::class, OVERRIDE).initializer("%S", characteristic.uuid).build()
    )
    this.addProperty(
      PropertySpec.builder("format", Types.format(), OVERRIDE)
        .initializer("%L", Types.formatOf(characteristic.format)).build()
    )
    this.addProperty(
      PropertySpec.builder("description", String::class, OVERRIDE).initializer("%S", characteristic.name)
        .build()
    )

    this.addProperty(
      PropertySpec.builder("range", ClassName("kotlin.ranges", "IntRange").nullable(), OVERRIDE)
        .initializer(
          if (characteristic.constraints?.minimumValue != null) {
            CodeBlock.of(
              "%T(%L,%L)",
              ClassName("kotlin.ranges", "IntRange"),
              characteristic.constraints.minimumValue,
              characteristic.constraints.maximumValue
            )
          } else {
            CodeBlock.of("null")
          }
        ).build()
    )

    this.addProperty(
      PropertySpec.builder("step", ClassName("kotlin", "Double").nullable(), OVERRIDE)
        .initializer(
          if (characteristic.constraints?.stepValue != null) {
            CodeBlock.of("%L", characteristic.constraints.stepValue)
          } else {
            CodeBlock.of("null")
          }
        ).build()
    )

    this.addProperty(
      PropertySpec.builder("unit", Types.valueUnit().nullable(), OVERRIDE)
        .initializer(
          if (characteristic.unit != null) {
            CodeBlock.of("%L", Types.valueUnitOf(characteristic.unit))
          } else {
            CodeBlock.of("null")
          }
        ).build()
    )
  }

  private fun TypeSpec.Builder.withFixedValueConstructor() = apply {
    if (!characteristic.isObservable) return this

    val f = FunSpec.constructorBuilder()
      .addParameter("value", valueType)

    if (characteristic.isWritable) {
      f.addParameter("command", commandType)
      f.callThisConstructor(CodeBlock.of("%T(value)", Types.observableValue()), CodeBlock.of("command"))
    } else {
      f.callThisConstructor(CodeBlock.of("%T(value)", Types.observableValue()))
    }

    addFunction(f.build())
  }


  private fun TypeSpec.Builder.withOptionalEnum() = apply {
    val values = enumValues()
    val main = this

    if (values.isNotEmpty()) {
      val e = TypeSpec.enumBuilder(enumClassName).apply {
        values.forEach(::addEnumConstant)
      }

      main.addProperty(PropertySpec.builder("validValues", ClassName("kotlin.collections", "Map")
        .parameterizedBy(enumClassName).plusParameter(Int::class))
        .addModifiers(OVERRIDE)
        .initializer(CodeBlock.builder()
          .addStatement("%T(mapOf(", ClassName("java.util", "EnumMap"))
          .apply {
            values.forEachIndexed { i, v ->
              addStatement("%T.%N to %L,", enumClassName, v, i)
            }
          }
          .addStatement("))")
          .build())
        .build())

      if (values.count() == 2) {
        e.addFunction(
          FunSpec.builder("toBoolean")
            .addStatement("return this == %N", values[1])
            .build()
        )

        e.addType(
          TypeSpec.companionObjectBuilder()
            .addFunction(
              FunSpec.builder("from")
                .addParameter("v", Boolean::class)
                .addStatement("return if(v) %N else %N", values[1], values[0])
                .build()
            ).build()
        )
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
}

