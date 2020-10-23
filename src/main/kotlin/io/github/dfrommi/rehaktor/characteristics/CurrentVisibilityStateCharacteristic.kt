// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class CurrentVisibilityStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<CurrentVisibilityStateCharacteristic.Enum>(
    type = "00000135-0000-1000-8000-0026BB765291",
    description = "Current Visibility State", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    SHOWN,
    HIDDEN,
    UNKNOWN_1,
    UNKNOWN_2,
  }
}
