// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class CurrentMediaStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<CurrentMediaStateCharacteristic.Enum>(
    type = "000000E0-0000-1000-8000-0026BB765291",
    description = "Current Media State", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    PLAY,
    PAUSE,
    STOP,
    UNKNOWN,
  }
}
