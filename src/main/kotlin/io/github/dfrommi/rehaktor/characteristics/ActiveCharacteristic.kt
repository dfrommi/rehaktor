// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class ActiveCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<ActiveCharacteristic.Enum>(
    type = "000000B0-0000-1000-8000-0026BB765291",
    description = "Active", enumClass = Enum::class, values = values, setter = setter, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    INACTIVE,
    ACTIVE,
    ;

    public fun toBoolean() = this == ACTIVE

    public companion object {
      public fun from(v: Boolean) = if (v) ACTIVE else INACTIVE
    }
  }
}
