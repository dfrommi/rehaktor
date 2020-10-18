// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetDoorStateCharacteristic(values: Flux<TargetDoorStateCharacteristic.Enum>, setter: (TargetDoorStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetDoorStateCharacteristic.Enum>(
  type = "00000032-0000-1000-8000-0026BB765291",
  description = "Target Door State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    OPEN,
    CLOSED;fun toBoolean() = this == CLOSED

    companion object {
      fun from(v: Boolean) = if (v) CLOSED else OPEN
    } 
  } 
}
