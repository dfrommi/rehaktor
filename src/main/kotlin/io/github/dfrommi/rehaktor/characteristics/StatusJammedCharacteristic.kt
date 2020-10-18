// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class StatusJammedCharacteristic(values: Flux<StatusJammedCharacteristic.Enum>) : EnumReactiveCharacteristic<StatusJammedCharacteristic.Enum>(
  type = "00000078-0000-1000-8000-0026BB765291",
  description = "Status Jammed",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NOT_JAMMED,
    JAMMED;fun toBoolean() = this == JAMMED

    companion object {
      fun from(v: Boolean) = if (v) JAMMED else NOT_JAMMED
    } 
  } 
}
