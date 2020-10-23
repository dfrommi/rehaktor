// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class ClosedCaptionsCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<ClosedCaptionsCharacteristic.Enum>(
    type = "000000DD-0000-1000-8000-0026BB765291",
    description = "Closed Captions", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    DISABLED,
    ENABLED,
    ;

    public fun toBoolean() = this == ENABLED

    public companion object {
      public fun from(v: Boolean) = if (v) ENABLED else DISABLED
    }
  }
}
