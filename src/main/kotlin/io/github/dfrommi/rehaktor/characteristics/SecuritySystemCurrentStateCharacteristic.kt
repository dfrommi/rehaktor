// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class SecuritySystemCurrentStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<SecuritySystemCurrentStateCharacteristic.Enum>(
    type = "00000066-0000-1000-8000-0026BB765291",
    description = "Security System Current State", enumClass = Enum::class, values = values,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    STAY_ARM,
    AWAY_ARM,
    NIGHT_ARM,
    DISARMED,
    ALARM_TRIGGERED,
  }
}
