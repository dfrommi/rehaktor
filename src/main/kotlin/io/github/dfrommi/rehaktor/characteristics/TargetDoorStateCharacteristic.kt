// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class TargetDoorStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TargetDoorStateCharacteristic.Enum>(
    type = "00000032-0000-1000-8000-0026BB765291",
    description = "Target Door State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    OPEN,
    CLOSED,
    ;

    public fun toBoolean() = this == CLOSED

    public companion object {
      public fun from(v: Boolean) = if (v) CLOSED else OPEN
    }
  }
}
