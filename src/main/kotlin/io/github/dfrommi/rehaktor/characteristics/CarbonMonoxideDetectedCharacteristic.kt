// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class CarbonMonoxideDetectedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<CarbonMonoxideDetectedCharacteristic.Enum>(
    type = "00000069-0000-1000-8000-0026BB765291",
    description = "Carbon Monoxide Detected", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    CO_LEVELS_NORMAL,
    CO_LEVELS_ABNORMAL,
    ;

    public fun toBoolean() = this == CO_LEVELS_ABNORMAL

    public companion object {
      public fun from(v: Boolean) = if (v) CO_LEVELS_ABNORMAL else CO_LEVELS_NORMAL
    }
  }
}
