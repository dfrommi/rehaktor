// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class ProgrammableSwitchEventCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<ProgrammableSwitchEventCharacteristic.Enum>(
    type = "00000073-0000-1000-8000-0026BB765291",
    description = "Programmable Switch Event", enumClass = Enum::class, values = values,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    SINGLE_PRESS,
    DOUBLE_PRESS,
    LONG_PRESS,
  }
}
