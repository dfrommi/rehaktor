package io.github.dfrommi.hapkt.generator.template

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.MemberName.Companion.member
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.STAR
import com.squareup.kotlinpoet.TypeName
import kotlin.reflect.KClass

object Types {
  private val corePackage = "io.github.dfrommi.hapkt.core"

  fun observableValue() = ClassName("${corePackage}.utils", "ObservableValue")

  fun valueUnit() = ClassName(corePackage, "ValueUnit")
  fun valueUnitOf(name: String) = valueUnit().member(name.toUpperCase())
  fun format() = ClassName(corePackage, "Format")
  fun formatOf(name: String) = format().member(name.toUpperCase())

  fun homekitService() = ClassName(corePackage, "HomekitService")
  fun homekitCharacteristic(genericType: TypeName = STAR) = ClassName(corePackage, "HomekitCharacteristic").parameterizedBy(genericType)

  fun readableCharacteristicBaseInterface(valueType: KClass<*>, enumClassName: ClassName) =
    characteristicBaseInterface(valueType, enumClassName, "Readable")
  fun observableCharacteristicBaseInterface(valueType: KClass<*>, enumClassName: ClassName) =
    characteristicBaseInterface(valueType, enumClassName, "Observable")
  fun writableCharacteristicBaseInterface(valueType: KClass<*>, enumClassName: ClassName) =
    characteristicBaseInterface(valueType, enumClassName, "Writable")

  private fun characteristicBaseInterface(valueType: KClass<*>, enumClassName: ClassName, prefix: String): TypeName {
    return when (valueType) {
      Boolean::class -> ClassName(corePackage, "${prefix}BooleanCharacteristic")
      Int::class -> ClassName(corePackage, "${prefix}IntegerCharacteristic")
      Double::class -> ClassName(corePackage, "${prefix}DoubleCharacteristic")
      String::class -> ClassName(corePackage, "${prefix}StringCharacteristic")
      ByteArray::class -> ClassName(corePackage, "${prefix}TlvCharacteristic")
      Enum::class -> ClassName(corePackage, "${prefix}FixedValuesCharacteristic").parameterizedBy(enumClassName)
      else -> throw IllegalArgumentException("No characteristic interface for value type $valueType available")
    }
  }

}
