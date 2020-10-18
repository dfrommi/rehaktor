// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ActiveCharacteristic(values: Flux<ActiveCharacteristic.Enum>, setter: (ActiveCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<ActiveCharacteristic.Enum>(
  type = "000000B0-0000-1000-8000-0026BB765291",
  description = "Active",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    INACTIVE,
    ACTIVE;fun toBoolean() = this == ACTIVE

    companion object {
      fun from(v: Boolean) = if (v) ACTIVE else INACTIVE
    } 
  } 
}
