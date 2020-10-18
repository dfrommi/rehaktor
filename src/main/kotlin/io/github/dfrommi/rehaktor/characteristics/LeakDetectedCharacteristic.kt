// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class LeakDetectedCharacteristic(values: Flux<LeakDetectedCharacteristic.Enum>) : EnumReactiveCharacteristic<LeakDetectedCharacteristic.Enum>(
  type = "00000070-0000-1000-8000-0026BB765291",
  description = "Leak Detected",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    LEAK_NOT_DETECTED,
    LEAK_DETECTED;fun toBoolean() = this == LEAK_DETECTED

    companion object {
      fun from(v: Boolean) = if (v) LEAK_DETECTED else LEAK_NOT_DETECTED
    } 
  } 
}
