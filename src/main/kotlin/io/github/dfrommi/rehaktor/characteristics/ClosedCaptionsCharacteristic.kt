// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ClosedCaptionsCharacteristic(values: Flux<ClosedCaptionsCharacteristic.Enum>, setter: (ClosedCaptionsCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<ClosedCaptionsCharacteristic.Enum>(
  type = "000000DD-0000-1000-8000-0026BB765291",
  description = "Closed Captions",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    DISABLED,
    ENABLED;fun toBoolean() = this == ENABLED

    companion object {
      fun from(v: Boolean) = if (v) ENABLED else DISABLED
    } 
  } 
}
