// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ProgramModeCharacteristic(values: Flux<ProgramModeCharacteristic.Enum>) : EnumReactiveCharacteristic<ProgramModeCharacteristic.Enum>(
  type = "000000D1-0000-1000-8000-0026BB765291",
  description = "Program Mode",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NO_PROGRAM_SCHEDULED,
    PROGRAM_SCHEDULED,
    PROGRAM_SCHEDULED_MANUAL_MODE;
  } 
}
