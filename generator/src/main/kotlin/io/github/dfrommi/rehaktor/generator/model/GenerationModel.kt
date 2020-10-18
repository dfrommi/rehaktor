package io.github.dfrommi.rehaktor.generator.model

import io.github.dfrommi.rehaktor.generator.metadata.Characteristic
import io.github.dfrommi.rehaktor.generator.metadata.HomekitMetadata
import io.github.dfrommi.rehaktor.generator.metadata.Service
import kotlin.reflect.KClass

class GenerationModel(metadata: HomekitMetadata) {
    val characteristics = metadata.characteristics
        .map { CharacteristicGenerationModel(it) }

    val services = metadata.services
        .map { ServiceGenerationModel(it, characteristics) }
}

class CharacteristicGenerationModel(characteristic: Characteristic) {
    val uuid = characteristic.uuid
    val description = characteristic.name

    val hasEnum = characteristic.hasFixedValues
    val enumValues = characteristic.constraints?.validValues?.entries
        ?.sortedBy { it.key.toInt() }
        ?.mapIndexed { index, (code, value) ->
            require(index == code.toInt()) { "$uuid: index of '$value' is $code, but expected $index" }
            val name = value.split(" ").joinToString("_") {
                it
                    .replace("[,()]".toRegex(), "")
                    .replace("[.-]".toRegex(), "_")
                    .toUpperCase()
            }
            if (name.first().isDigit()) "`$name`" else name
        }

    val valueType = characteristic.valueType

    val className = description.split(" ")
        .joinToString(separator = "", postfix = "Characteristic") {
            it.replace(".", "").capitalize()
        }

    val valueTypeName = when (valueType) {
        Enum::class -> "$className.Enum"
        else -> valueType.simpleName
    }

    val constructorParameters = listOfNotNull(
        characteristic.isReadable.mapTrue {
            if (characteristic.isObservable)
                "values" to "Flux<$valueTypeName>"
            else
                "value" to valueTypeName
        },
        characteristic.isWritable.mapTrue { "setter" to "($valueTypeName) -> Any?" }
    )


    val baseClass = when (valueType) {
        String::class -> "StringReactiveCharacteristic"
        Boolean::class -> "BooleanReactiveCharacteristic"
        Int::class -> "IntegerReactiveCharacteristic"
        Double::class -> "DoubleReactiveCharacteristic"
        Enum::class -> "EnumReactiveCharacteristic<$valueTypeName>"
        ByteArray::class -> "TlvReactiveCharacteristic"
        else -> throw IllegalArgumentException("Type $valueType not supported")
    }

    val baseClassArguments = listOfNotNull(
        "type" to uuid,
        "description" to description,
        characteristic.constraints?.minimumValue?.let {
            "minValue" to it.mapToValueType(valueType)
        },
        characteristic.constraints?.maximumValue?.let {
            "maxValue" to it.mapToValueType(valueType)
        },
        characteristic.constraints?.stepValue?.let {
            "minStep" to it.mapToValueType(valueType)
        },
        characteristic.unit?.let {
            "unit" to "ValueUnit.${it.toUpperCase()}"
        },
        (valueType == Int::class).mapTrue {
            "format" to "Format.${characteristic.format.toUpperCase()}"
        },
        hasEnum.mapTrue { "enumClass" to "Enum::class" },
        characteristic.isReadable.mapTrue {
            if (characteristic.isObservable)
                "values" to "values"
            else
                "values" to "Flux.just(value)"
        },
        characteristic.isWritable.mapTrue { "setter" to "setter" },
        "isObservable" to characteristic.isObservable
    )
}

class ServiceGenerationModel(
        private val service: Service,
        private val characteristics: Collection<CharacteristicGenerationModel>
) {
    private val optionalCharacteristicsFiltered = service.optionalCharacteristicsUUIDs?.filter { uuid ->
        characteristics.any { it.uuid == uuid }
    } ?: emptyList()

    val uuid = service.uuid

    val className = service.name.split(" ")
        .joinToString(separator = "", postfix = "Service") {
            it.capitalize()
        }

    val constructorParameters = service.requiredCharacteristicsUUIDs.map { uuid ->
        paramNameAndType(uuid).let { "${it.first}: ${it.second}" }
    } + optionalCharacteristicsFiltered.map { uuid ->
        paramNameAndType(uuid).let { "${it.first}: ${it.second}? = null" }
    }

    val characteristicParamNames = service.requiredCharacteristicsUUIDs.map { uuid ->
        paramNameAndType(uuid).first
    } + optionalCharacteristicsFiltered.map { uuid ->
        paramNameAndType(uuid).first
    }

    private fun paramNameAndType(uuid: String): Pair<String, String> {
        val characteristic = characteristics.find { it.uuid == uuid }
            ?: throw IllegalStateException("Service ${service.name} requires characteristic $uuid, but not found")

        val paramName = characteristic.description.split(" ").joinToString("") {
            it.replace("[.]".toRegex(), "")
        }.decapitalize()
        val paramType = characteristic.className

        return paramName to paramType
    }
}

private fun <T> Boolean.mapTrue(mapper: (Boolean) -> T): T? = if (this) mapper(this) else null
private fun Double?.mapToValueType(valueType: KClass<out Any>) = when (valueType) {
    Int::class -> this?.toInt()
    else -> this
}
