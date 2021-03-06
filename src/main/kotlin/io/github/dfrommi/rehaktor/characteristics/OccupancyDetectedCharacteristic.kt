// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class OccupancyDetectedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<OccupancyDetectedCharacteristic.Enum>(
    type = "00000071-0000-1000-8000-0026BB765291",
    description = "Occupancy Detected", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    OCCUPANCY_NOT_DETECTED,
    OCCUPANCY_DETECTED,
    ;

    public fun toBoolean() = this == OCCUPANCY_DETECTED

    public companion object {
      public fun from(v: Boolean) = if (v) OCCUPANCY_DETECTED else OCCUPANCY_NOT_DETECTED
    }
  }
}
