// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class LockTargetStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<LockTargetStateCharacteristic.Enum>(
    type = "0000001E-0000-1000-8000-0026BB765291",
    description = "Lock Target State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    UNSECURED,
    SECURED,
    ;

    public fun toBoolean() = this == SECURED

    public companion object {
      public fun from(v: Boolean) = if (v) SECURED else UNSECURED
    }
  }
}
