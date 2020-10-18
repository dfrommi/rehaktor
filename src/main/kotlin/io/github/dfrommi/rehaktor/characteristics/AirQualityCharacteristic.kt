// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class AirQualityCharacteristic(values: Flux<AirQualityCharacteristic.Enum>) : EnumReactiveCharacteristic<AirQualityCharacteristic.Enum>(
  type = "00000095-0000-1000-8000-0026BB765291",
  description = "Air Quality",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    UNKNOWN,
    EXCELLENT,
    GOOD,
    FAIR,
    INFERIOR,
    POOR;
  } 
}
