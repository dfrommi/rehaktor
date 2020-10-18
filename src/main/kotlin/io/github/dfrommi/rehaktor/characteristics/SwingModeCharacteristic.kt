// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SwingModeCharacteristic(values: Flux<SwingModeCharacteristic.Enum>, setter: (SwingModeCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<SwingModeCharacteristic.Enum>(
  type = "000000B6-0000-1000-8000-0026BB765291",
  description = "Swing Mode",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    SWING_DISABLED,
    SWING_ENABLED;fun toBoolean() = this == SWING_ENABLED

    companion object {
      fun from(v: Boolean) = if (v) SWING_ENABLED else SWING_DISABLED
    } 
  } 
}
