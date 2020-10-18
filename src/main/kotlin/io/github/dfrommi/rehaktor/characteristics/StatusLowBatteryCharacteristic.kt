// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class StatusLowBatteryCharacteristic(values: Flux<StatusLowBatteryCharacteristic.Enum>) : EnumReactiveCharacteristic<StatusLowBatteryCharacteristic.Enum>(
  type = "00000079-0000-1000-8000-0026BB765291",
  description = "Status Low Battery",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    BATTERY_LEVEL_NORMAL,
    BATTERY_LEVEL_LOW;fun toBoolean() = this == BATTERY_LEVEL_LOW

    companion object {
      fun from(v: Boolean) = if (v) BATTERY_LEVEL_LOW else BATTERY_LEVEL_NORMAL
    } 
  } 
}
