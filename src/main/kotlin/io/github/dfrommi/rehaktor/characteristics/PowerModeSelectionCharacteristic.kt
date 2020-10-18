// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*

class PowerModeSelectionCharacteristic(setter: (PowerModeSelectionCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<PowerModeSelectionCharacteristic.Enum>(
  type = "000000DF-0000-1000-8000-0026BB765291",
  description = "Power Mode Selection",
  enumClass = Enum::class,
  setter = setter,
  isObservable = false
) {
  enum class Enum {
    SHOW,
    HIDE;fun toBoolean() = this == HIDE

    companion object {
      fun from(v: Boolean) = if (v) HIDE else SHOW
    } 
  } 
}
