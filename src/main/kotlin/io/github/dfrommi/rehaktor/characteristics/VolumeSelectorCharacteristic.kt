// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*

class VolumeSelectorCharacteristic(setter: (VolumeSelectorCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<VolumeSelectorCharacteristic.Enum>(
  type = "000000EA-0000-1000-8000-0026BB765291",
  description = "Volume Selector",
  enumClass = Enum::class,
  setter = setter,
  isObservable = false
) {
  enum class Enum {
    INCREMENT,
    DECREMENT;fun toBoolean() = this == DECREMENT

    companion object {
      fun from(v: Boolean) = if (v) DECREMENT else INCREMENT
    } 
  } 
}
