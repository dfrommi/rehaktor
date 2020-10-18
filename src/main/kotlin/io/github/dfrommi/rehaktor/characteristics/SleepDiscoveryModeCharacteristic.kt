// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SleepDiscoveryModeCharacteristic(values: Flux<SleepDiscoveryModeCharacteristic.Enum>) : EnumReactiveCharacteristic<SleepDiscoveryModeCharacteristic.Enum>(
  type = "000000E8-0000-1000-8000-0026BB765291",
  description = "Sleep Discovery Mode",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NOT_DISCOVERABLE,
    ALWAYS_DISCOVERABLE;fun toBoolean() = this == ALWAYS_DISCOVERABLE

    companion object {
      fun from(v: Boolean) = if (v) ALWAYS_DISCOVERABLE else NOT_DISCOVERABLE
    } 
  } 
}
