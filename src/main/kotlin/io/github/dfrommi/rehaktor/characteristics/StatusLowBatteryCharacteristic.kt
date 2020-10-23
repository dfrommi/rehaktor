// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class StatusLowBatteryCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<StatusLowBatteryCharacteristic.Enum>(
    type = "00000079-0000-1000-8000-0026BB765291",
    description = "Status Low Battery", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    BATTERY_LEVEL_NORMAL,
    BATTERY_LEVEL_LOW,
    ;

    public fun toBoolean() = this == BATTERY_LEVEL_LOW

    public companion object {
      public fun from(v: Boolean) = if (v) BATTERY_LEVEL_LOW else BATTERY_LEVEL_NORMAL
    }
  }
}
