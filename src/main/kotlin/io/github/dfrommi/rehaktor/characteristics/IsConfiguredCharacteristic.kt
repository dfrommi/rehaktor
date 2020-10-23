// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class IsConfiguredCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<IsConfiguredCharacteristic.Enum>(
    type = "000000D6-0000-1000-8000-0026BB765291",
    description = "Is Configured", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    NOT_CONFIGURED,
    CONFIGURED,
    ;

    public fun toBoolean() = this == CONFIGURED

    public companion object {
      public fun from(v: Boolean) = if (v) CONFIGURED else NOT_CONFIGURED
    }
  }
}
