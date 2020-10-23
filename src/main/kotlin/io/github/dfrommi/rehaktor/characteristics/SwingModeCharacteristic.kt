// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class SwingModeCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<SwingModeCharacteristic.Enum>(
    type = "000000B6-0000-1000-8000-0026BB765291",
    description = "Swing Mode", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    SWING_DISABLED,
    SWING_ENABLED,
    ;

    public fun toBoolean() = this == SWING_ENABLED

    public companion object {
      public fun from(v: Boolean) = if (v) SWING_ENABLED else SWING_DISABLED
    }
  }
}
