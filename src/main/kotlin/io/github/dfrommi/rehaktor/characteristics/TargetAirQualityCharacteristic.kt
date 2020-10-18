// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetAirQualityCharacteristic(values: Flux<TargetAirQualityCharacteristic.Enum>, setter: (TargetAirQualityCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetAirQualityCharacteristic.Enum>(
  type = "000000AE-0000-1000-8000-0026BB765291",
  description = "Target Air Quality",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    EXCELLENT,
    GOOD,
    FAIR;
  } 
}
