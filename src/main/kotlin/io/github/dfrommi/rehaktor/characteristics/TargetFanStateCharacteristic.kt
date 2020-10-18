// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetFanStateCharacteristic(values: Flux<TargetFanStateCharacteristic.Enum>, setter: (TargetFanStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetFanStateCharacteristic.Enum>(
  type = "000000BF-0000-1000-8000-0026BB765291",
  description = "Target Fan State",
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
