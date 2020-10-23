// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class LockCurrentStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<LockCurrentStateCharacteristic.Enum>(
    type = "0000001D-0000-1000-8000-0026BB765291",
    description = "Lock Current State", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    UNSECURED,
    SECURED,
    JAMMED,
    UNKNOWN,
  }
}
