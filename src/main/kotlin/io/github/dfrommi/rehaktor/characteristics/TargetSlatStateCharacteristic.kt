// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetSlatStateCharacteristic(values: Flux<TargetSlatStateCharacteristic.Enum>, setter: (TargetSlatStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetSlatStateCharacteristic.Enum>(
  type = "000000BE-0000-1000-8000-0026BB765291",
  description = "Target Slat State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    MANUAL,
    AUTO;fun toBoolean() = this == AUTO

    companion object {
      fun from(v: Boolean) = if (v) AUTO else MANUAL
    } 
  } 
}
