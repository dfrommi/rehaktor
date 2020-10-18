// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentVisibilityStateCharacteristic(values: Flux<CurrentVisibilityStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentVisibilityStateCharacteristic.Enum>(
  type = "00000135-0000-1000-8000-0026BB765291",
  description = "Current Visibility State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    SHOWN,
    HIDDEN,
    UNKNOWN_1,
    UNKNOWN_2;
  } 
}
