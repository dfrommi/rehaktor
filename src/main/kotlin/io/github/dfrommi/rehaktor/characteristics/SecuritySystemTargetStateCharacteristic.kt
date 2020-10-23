// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any

public open class SecuritySystemTargetStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<SecuritySystemTargetStateCharacteristic.Enum>(
    type = "00000067-0000-1000-8000-0026BB765291",
    description = "Security System Target State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    STAY_ARM,
    AWAY_ARM,
    NIGHT_ARM,
    DISARM,
  }
}
