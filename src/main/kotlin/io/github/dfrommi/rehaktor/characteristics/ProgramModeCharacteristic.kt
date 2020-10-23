// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class ProgramModeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<ProgramModeCharacteristic.Enum>(
    type = "000000D1-0000-1000-8000-0026BB765291",
    description = "Program Mode", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NO_PROGRAM_SCHEDULED,
    PROGRAM_SCHEDULED,
    PROGRAM_SCHEDULED_MANUAL_MODE,
  }
}
