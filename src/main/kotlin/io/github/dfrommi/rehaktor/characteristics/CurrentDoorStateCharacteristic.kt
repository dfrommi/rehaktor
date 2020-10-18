// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentDoorStateCharacteristic(values: Flux<CurrentDoorStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentDoorStateCharacteristic.Enum>(
  type = "0000000E-0000-1000-8000-0026BB765291",
  description = "Current Door State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    OPEN,
    CLOSED,
    OPENING,
    CLOSING,
    STOPPED;
  } 
}
