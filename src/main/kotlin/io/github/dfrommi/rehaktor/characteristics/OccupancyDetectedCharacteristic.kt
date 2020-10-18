// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class OccupancyDetectedCharacteristic(values: Flux<OccupancyDetectedCharacteristic.Enum>) : EnumReactiveCharacteristic<OccupancyDetectedCharacteristic.Enum>(
  type = "00000071-0000-1000-8000-0026BB765291",
  description = "Occupancy Detected",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    OCCUPANCY_NOT_DETECTED,
    OCCUPANCY_DETECTED;fun toBoolean() = this == OCCUPANCY_DETECTED

    companion object {
      fun from(v: Boolean) = if (v) OCCUPANCY_DETECTED else OCCUPANCY_NOT_DETECTED
    } 
  } 
}
