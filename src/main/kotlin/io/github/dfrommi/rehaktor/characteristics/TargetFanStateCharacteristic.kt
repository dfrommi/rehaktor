// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class TargetFanStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TargetFanStateCharacteristic.Enum>(
    type = "000000BF-0000-1000-8000-0026BB765291",
    description = "Target Fan State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    MANUAL,
    AUTO,
    ;

    public fun toBoolean() = this == AUTO

    public companion object {
      public fun from(v: Boolean) = if (v) AUTO else MANUAL
    }
  }
}
