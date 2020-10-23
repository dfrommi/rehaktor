// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class RotationDirectionCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<RotationDirectionCharacteristic.Enum>(
    type = "00000028-0000-1000-8000-0026BB765291",
    description = "Rotation Direction", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    CLOCKWISE,
    COUNTER_CLOCKWISE,
    ;

    public fun toBoolean() = this == COUNTER_CLOCKWISE

    public companion object {
      public fun from(v: Boolean) = if (v) COUNTER_CLOCKWISE else CLOCKWISE
    }
  }
}
