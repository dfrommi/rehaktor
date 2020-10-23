package io.github.dfrommi.rehaktor.generator.template

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.TypeSpec
import io.github.dfrommi.rehaktor.generator.metadata.Service

class ServiceClassBuilder(
    val packageName: String,
    val service: Service,
    val characteristicByUuid: Map<String, ClassSpec>
) {
    companion object {
        private val hapJavaServiceClassName = ClassName("io.github.hapjava.services", "Service")
    }
    private val className = ClassName(packageName, service.name.split(" ")
        .joinToString(separator = "", postfix = "Service") {
            it.capitalize()
        })

    fun build(): ClassSpec {
        return ClassSpec(
            className,
            TypeSpec.classBuilder(className)
            .primaryConstructor(serviceConstructor())
            .addSuperinterface(
                hapJavaServiceClassName,
                delegate = CodeBlock.builder()
                    .addStatement("io.github.dfrommi.rehaktor.core.HomekitService(").indent()
                    .addStatement("type = %S,", service.uuid)
                    .addStatement("characteristics = listOfNotNull(").indent()
                    .add(
                        allCharacteristicParamNames().joinToString(",\n", postfix = "\n")
                    )
                    .unindent().addStatement("),")
                    .addStatement("linkedServices = linkedServices")
                    .unindent().addStatement(")")
                    .build()
            )
            .build()
        )
    }

    private fun serviceConstructor(): FunSpec {
        val f = FunSpec.constructorBuilder()

        service.requiredCharacteristicsUUIDs
            .map { characteristicByUuid.getValue(it) }
            .forEach {
                f.addParameter(it.paramName(), it.name)
        }

        service.optionalCharacteristicsUUIDs
            .map { characteristicByUuid.getValue(it) }
            .forEach {
                f.addParameter(
                    ParameterSpec.builder(it.paramName(), it.name.copy(nullable = true))
                        .defaultValue("%L", null)
                        .build()
                )
            }

        f.addParameter(
            ParameterSpec.builder(
                "linkedServices",
                LIST.parameterizedBy(hapJavaServiceClassName)
            ).defaultValue("emptyList()")
                .build()
        )

        return f.build()
    }

    private fun ClassSpec.paramName() = name.simpleName.decapitalize().removeSuffix("Characteristic")

    private fun allCharacteristicParamNames() =
        (service.requiredCharacteristicsUUIDs + service.optionalCharacteristicsUUIDs)
        .map {
            characteristicByUuid.getValue(it).paramName()
        }
}
