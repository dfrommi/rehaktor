// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class PositionStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<PositionStateCharacteristic.Enum>(
    type = "00000072-0000-1000-8000-0026BB765291",
    description = "Position State", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    DECREASING,
    INCREASING,
    STOPPED,
  }
}
