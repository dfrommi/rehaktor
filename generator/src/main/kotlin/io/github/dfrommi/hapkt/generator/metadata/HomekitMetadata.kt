package io.github.dfrommi.hapkt.generator.metadata

import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.DeserializationFeature
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import java.lang.IllegalStateException

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

  init {
    //validate assumptions
    val minMaxViolations = characteristics
      .filter { (it.constraints?.minimumValue != null) xor (it.constraints?.maximumValue != null) }
      .joinToString(transform = Characteristic::name)
    require(minMaxViolations.isEmpty()) { "Characteristics have only max or min, but not both values: $minMaxViolations"}

    val noValueViolations = characteristics
      .filter { !it.isObservable && !it.isReadable && !it.isWritable }
      .joinToString(transform = Characteristic::name)
    require(noValueViolations.isEmpty()) { "Characteristics are neither readable not writable: $minMaxViolations"}

    val observableViolations = characteristics
      .filter { it.isObservable && !it.isReadable }
      .joinToString(transform = Characteristic::name)
    require(observableViolations.isEmpty()) { "Characteristics are observable, but not readable: $minMaxViolations"}
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
  val maximumValue: Int?,

  @JsonProperty("MinimumValue")
  val minimumValue: Int?,

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
  val optionalCharacteristicsUUIDs: List<String> = emptyList()
)
