// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ProgrammableSwitchEventCharacteristic(values: Flux<ProgrammableSwitchEventCharacteristic.Enum>) : EnumReactiveCharacteristic<ProgrammableSwitchEventCharacteristic.Enum>(
  type = "00000073-0000-1000-8000-0026BB765291",
  description = "Programmable Switch Event",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    SINGLE_PRESS,
    DOUBLE_PRESS,
    LONG_PRESS;
  } 
}
