// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PositionStateCharacteristic(values: Flux<PositionStateCharacteristic.Enum>) : EnumReactiveCharacteristic<PositionStateCharacteristic.Enum>(
  type = "00000072-0000-1000-8000-0026BB765291",
  description = "Position State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    DECREASING,
    INCREASING,
    STOPPED;
  } 
}
