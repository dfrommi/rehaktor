// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class TemperatureDisplayUnitsCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TemperatureDisplayUnitsCharacteristic.Enum>(
    type = "00000036-0000-1000-8000-0026BB765291",
    description = "Temperature Display Units", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    CELSIUS,
    FAHRENHEIT,
    ;

    public fun toBoolean() = this == FAHRENHEIT

    public companion object {
      public fun from(v: Boolean) = if (v) FAHRENHEIT else CELSIUS
    }
  }
}
