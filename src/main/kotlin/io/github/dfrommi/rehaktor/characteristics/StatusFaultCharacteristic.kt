// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class StatusFaultCharacteristic(values: Flux<StatusFaultCharacteristic.Enum>) : EnumReactiveCharacteristic<StatusFaultCharacteristic.Enum>(
  type = "00000077-0000-1000-8000-0026BB765291",
  description = "Status Fault",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NO_FAULT,
    GENERAL_FAULT;fun toBoolean() = this == GENERAL_FAULT

    companion object {
      fun from(v: Boolean) = if (v) GENERAL_FAULT else NO_FAULT
    } 
  } 
}
