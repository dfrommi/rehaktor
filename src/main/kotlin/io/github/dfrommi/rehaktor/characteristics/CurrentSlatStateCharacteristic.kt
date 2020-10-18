// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentSlatStateCharacteristic(values: Flux<CurrentSlatStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentSlatStateCharacteristic.Enum>(
  type = "000000AA-0000-1000-8000-0026BB765291",
  description = "Current Slat State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    FIXED,
    JAMMED,
    SWINGING;
  } 
}
