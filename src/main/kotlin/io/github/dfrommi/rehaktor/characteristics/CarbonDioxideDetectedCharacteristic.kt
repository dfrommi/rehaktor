// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class CarbonDioxideDetectedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<CarbonDioxideDetectedCharacteristic.Enum>(
    type = "00000092-0000-1000-8000-0026BB765291",
    description = "Carbon Dioxide Detected", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    CO2_LEVELS_NORMAL,
    CO2_LEVELS_ABNORMAL,
    ;

    public fun toBoolean() = this == CO2_LEVELS_ABNORMAL

    public companion object {
      public fun from(v: Boolean) = if (v) CO2_LEVELS_ABNORMAL else CO2_LEVELS_NORMAL
    }
  }
}
