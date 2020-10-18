// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CarbonDioxideDetectedCharacteristic(values: Flux<CarbonDioxideDetectedCharacteristic.Enum>) : EnumReactiveCharacteristic<CarbonDioxideDetectedCharacteristic.Enum>(
  type = "00000092-0000-1000-8000-0026BB765291",
  description = "Carbon Dioxide Detected",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    CO2_LEVELS_NORMAL,
    CO2_LEVELS_ABNORMAL;fun toBoolean() = this == CO2_LEVELS_ABNORMAL

    companion object {
      fun from(v: Boolean) = if (v) CO2_LEVELS_ABNORMAL else CO2_LEVELS_NORMAL
    } 
  } 
}
