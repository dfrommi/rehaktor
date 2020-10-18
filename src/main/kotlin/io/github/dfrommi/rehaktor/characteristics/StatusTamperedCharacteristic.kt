// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class StatusTamperedCharacteristic(values: Flux<StatusTamperedCharacteristic.Enum>) : EnumReactiveCharacteristic<StatusTamperedCharacteristic.Enum>(
  type = "0000007A-0000-1000-8000-0026BB765291",
  description = "Status Tampered",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NOT_TAMPERED,
    TAMPERED;fun toBoolean() = this == TAMPERED

    companion object {
      fun from(v: Boolean) = if (v) TAMPERED else NOT_TAMPERED
    } 
  } 
}
