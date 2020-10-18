// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class RotationDirectionCharacteristic(values: Flux<RotationDirectionCharacteristic.Enum>, setter: (RotationDirectionCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<RotationDirectionCharacteristic.Enum>(
  type = "00000028-0000-1000-8000-0026BB765291",
  description = "Rotation Direction",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    CLOCKWISE,
    COUNTER_CLOCKWISE;fun toBoolean() = this == COUNTER_CLOCKWISE

    companion object {
      fun from(v: Boolean) = if (v) COUNTER_CLOCKWISE else CLOCKWISE
    } 
  } 
}
