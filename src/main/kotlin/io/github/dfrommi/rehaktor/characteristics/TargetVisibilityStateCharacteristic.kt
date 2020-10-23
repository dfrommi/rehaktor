// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class TargetVisibilityStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TargetVisibilityStateCharacteristic.Enum>(
    type = "00000134-0000-1000-8000-0026BB765291",
    description = "Target Visibility State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    SHOWN,
    HIDDEN,
    ;

    public fun toBoolean() = this == HIDDEN

    public companion object {
      public fun from(v: Boolean) = if (v) HIDDEN else SHOWN
    }
  }
}
