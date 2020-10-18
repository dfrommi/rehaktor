// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CarbonMonoxideDetectedCharacteristic(values: Flux<CarbonMonoxideDetectedCharacteristic.Enum>) : EnumReactiveCharacteristic<CarbonMonoxideDetectedCharacteristic.Enum>(
  type = "00000069-0000-1000-8000-0026BB765291",
  description = "Carbon Monoxide Detected",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    CO_LEVELS_NORMAL,
    CO_LEVELS_ABNORMAL;fun toBoolean() = this == CO_LEVELS_ABNORMAL

    companion object {
      fun from(v: Boolean) = if (v) CO_LEVELS_ABNORMAL else CO_LEVELS_NORMAL
    } 
  } 
}
