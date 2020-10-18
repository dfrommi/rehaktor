// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentFanStateCharacteristic(values: Flux<CurrentFanStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentFanStateCharacteristic.Enum>(
  type = "000000AF-0000-1000-8000-0026BB765291",
  description = "Current Fan State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    INACTIVE,
    IDLE,
    BLOWING_AIR;
  } 
}
