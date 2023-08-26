package io.github.dfrommi.hapkt.generator.template

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

fun ClassName.nullable() = this.copy(nullable = true)

fun TypeSpec.Builder.addConstructorProperty(
  constructorBuilder: FunSpec.Builder,
  parameter: ParameterSpec,
  vararg propertyModifiers: KModifier
) {
  constructorBuilder.addParameter(parameter)

  this.addProperty(
    PropertySpec.builder(parameter.name, parameter.type)
      .initializer(parameter.name)
      .addModifiers(*propertyModifiers)
      .build()
  )
}

fun reformatCode(file: File) {
  com.pinterest.ktlint.main(arrayOf("-F", file.absolutePath))
}

data class ClassSpec(
  val name: ClassName,
  val type: TypeSpec
)
