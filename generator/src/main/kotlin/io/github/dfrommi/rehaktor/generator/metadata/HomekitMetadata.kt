package io.github.dfrommi.rehaktor.generator.metadata

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

data class HomekitMetadata(
        @JsonProperty("Characteristics")
    val characteristics: List<Characteristic>,

        @JsonProperty("Services")
    val services: List<Service>
) {
    companion object {
        private val mapper = jacksonObjectMapper()
            .findAndRegisterModules()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

        fun fromResources(vararg resource: String) = resource.map {
            val content = HomekitMetadata::class.java.getResourceAsStream(it).readBytes()
            mapper.readValue<HomekitMetadata>(content)
        }.let { meta ->
            HomekitMetadata(
                characteristics = meta.flatMap { it.characteristics }.sortedBy { it.name },
                services = meta.flatMap { it.services }.sortedBy { it.name }
            )
        }
    }
}

data class Characteristic(
        @JsonProperty("UUID")
    val uuid: String,

        @JsonProperty("Name")
    val name: String,

        @JsonProperty("Constraints")
    val constraints: Constraint?,

        @JsonProperty("Unit")
    val unit: String?,

        @JsonProperty("Format")
    val format: String,

        @JsonProperty("Properties")
    val properties: List<String>
) {
    val isReadable = "read" in properties
    val isWritable = "write" in properties
    val isObservable = "cnotify" in properties

    val hasFixedValues = constraints?.validValues?.entries?.isNotEmpty() ?: false

    val valueType by lazy {
        when {
            format == "string" -> String::class
            format == "bool" -> Boolean::class
            format.contains("int") && hasFixedValues -> Enum::class
            format.contains("int") -> Int::class
            format.startsWith("float") -> Double::class
            format == "tlv8" -> ByteArray::class
            else -> throw IllegalArgumentException("$name - format $format not supported")
        }
    }
}

data class Constraint(
    @JsonProperty("MaximumValue")
    val maximumValue: Double?,

    @JsonProperty("MinimumValue")
    val minimumValue: Double?,

    @JsonProperty("StepValue")
    val stepValue: Double?,

    @JsonProperty("ValidValues")
    val validValues: Map<String, String>?
)

data class Service(
    @JsonProperty("UUID")
    val uuid: String,

    @JsonProperty("Name")
    val name: String,

    @JsonProperty("RequiredCharacteristics")
    val requiredCharacteristicsUUIDs: List<String>,

    @JsonProperty("OptionalCharacteristics")
    val optionalCharacteristicsUUIDs: List<String>?
)
