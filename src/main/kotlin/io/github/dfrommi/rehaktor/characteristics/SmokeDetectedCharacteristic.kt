// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SmokeDetectedCharacteristic(values: Flux<SmokeDetectedCharacteristic.Enum>) : EnumReactiveCharacteristic<SmokeDetectedCharacteristic.Enum>(
  type = "00000076-0000-1000-8000-0026BB765291",
  description = "Smoke Detected",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    SMOKE_NOT_DETECTED,
    SMOKE_DETECTED;fun toBoolean() = this == SMOKE_DETECTED

    companion object {
      fun from(v: Boolean) = if (v) SMOKE_DETECTED else SMOKE_NOT_DETECTED
    } 
  } 
}
