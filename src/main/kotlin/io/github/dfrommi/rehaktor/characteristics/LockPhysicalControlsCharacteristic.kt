// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class LockPhysicalControlsCharacteristic(values: Flux<LockPhysicalControlsCharacteristic.Enum>, setter: (LockPhysicalControlsCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<LockPhysicalControlsCharacteristic.Enum>(
  type = "000000A7-0000-1000-8000-0026BB765291",
  description = "Lock Physical Controls",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    CONTROL_LOCK_DISABLED,
    CONTROL_LOCK_ENABLED;fun toBoolean() = this == CONTROL_LOCK_ENABLED

    companion object {
      fun from(v: Boolean) = if (v) CONTROL_LOCK_ENABLED else CONTROL_LOCK_DISABLED
    } 
  } 
}
