// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class LockTargetStateCharacteristic(values: Flux<LockTargetStateCharacteristic.Enum>, setter: (LockTargetStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<LockTargetStateCharacteristic.Enum>(
  type = "0000001E-0000-1000-8000-0026BB765291",
  description = "Lock Target State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    UNSECURED,
    SECURED;fun toBoolean() = this == SECURED

    companion object {
      fun from(v: Boolean) = if (v) SECURED else UNSECURED
    } 
  } 
}
