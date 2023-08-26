package io.github.dfrommi.hapkt.generator.template

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier.OVERRIDE
import com.squareup.kotlinpoet.LIST
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import io.github.dfrommi.hapkt.generator.metadata.Service

class ServiceClassBuilder(
  private val packageName: String,
  private val service: Service,
  private val characteristicByUuid: Map<String, ClassSpec>
) {
  private val className = ClassName(packageName, service.name.split(" ")
    .joinToString(separator = "", postfix = "") {
      it.capitalize()
    })

  fun build(): ClassSpec {
    return ClassSpec(
      className,
      TypeSpec.classBuilder(className)
        .withServiceConstructor()
        .withSuperInterface()
        .build()
    )
  }

  private fun TypeSpec.Builder.withServiceConstructor(): TypeSpec.Builder {
    val f = FunSpec.constructorBuilder()

    service.requiredCharacteristicsUUIDs
      .map { characteristicByUuid.getValue(it) }
      .forEach {
        addConstructorProperty(f, ParameterSpec.builder(it.paramName(), it.name).build()
        )
      }

    service.optionalCharacteristicsUUIDs
      .map { characteristicByUuid.getValue(it) }
      .forEach {
        addConstructorProperty(f,
          ParameterSpec.builder(it.paramName(), it.name.copy(nullable = true))
            .defaultValue("%L", null)
            .build()
        )
      }

    addConstructorProperty(f,
      ParameterSpec.builder("linkedServices", LIST.parameterizedBy(Types.homekitService()))
        .defaultValue("emptyList()")
        .build(),
      OVERRIDE
    )
    return this.primaryConstructor(f.build())
  }

  private fun TypeSpec.Builder.withSuperInterface(): TypeSpec.Builder = apply {
    addSuperinterface(Types.homekitService())

    addProperty(
      PropertySpec.builder("type", String::class, OVERRIDE).initializer("%S", service.uuid).build()
    )

    addProperty(
      PropertySpec.builder(
        "characteristics",
        LIST.parameterizedBy(Types.homekitCharacteristic()),
        OVERRIDE
      ).initializer(
        CodeBlock.builder()
          .addStatement("listOfNotNull(").indent()
          .add(
            allCharacteristicParamNames().joinToString(",\n", postfix = "\n")
          )
          .unindent().addStatement(")")
          .build()
      )
        .build()
    )
  }

  private fun ClassSpec.paramName() = name.simpleName.decapitalize()

  private fun allCharacteristicParamNames() =
    (service.requiredCharacteristicsUUIDs + service.optionalCharacteristicsUUIDs)
      .map {
        characteristicByUuid.getValue(it).paramName()
      }
}
