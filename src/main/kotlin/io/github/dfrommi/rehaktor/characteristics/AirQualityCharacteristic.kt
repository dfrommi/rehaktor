// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class AirQualityCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<AirQualityCharacteristic.Enum>(
    type = "00000095-0000-1000-8000-0026BB765291",
    description = "Air Quality", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    UNKNOWN,
    EXCELLENT,
    GOOD,
    FAIR,
    INFERIOR,
    POOR,
  }
}
