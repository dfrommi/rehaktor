// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ChargingStateCharacteristic(values: Flux<ChargingStateCharacteristic.Enum>) : EnumReactiveCharacteristic<ChargingStateCharacteristic.Enum>(
  type = "0000008F-0000-1000-8000-0026BB765291",
  description = "Charging State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NOT_CHARGING,
    CHARGING,
    NOT_CHARGEABLE;
  } 
}
