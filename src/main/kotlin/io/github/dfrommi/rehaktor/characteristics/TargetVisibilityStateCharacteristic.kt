// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetVisibilityStateCharacteristic(values: Flux<TargetVisibilityStateCharacteristic.Enum>, setter: (TargetVisibilityStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetVisibilityStateCharacteristic.Enum>(
  type = "00000134-0000-1000-8000-0026BB765291",
  description = "Target Visibility State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    SHOWN,
    HIDDEN;fun toBoolean() = this == HIDDEN

    companion object {
      fun from(v: Boolean) = if (v) HIDDEN else SHOWN
    } 
  } 
}
