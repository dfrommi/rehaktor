// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentMediaStateCharacteristic(values: Flux<CurrentMediaStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentMediaStateCharacteristic.Enum>(
  type = "000000E0-0000-1000-8000-0026BB765291",
  description = "Current Media State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    PLAY,
    PAUSE,
    STOP,
    UNKNOWN;
  } 
}
