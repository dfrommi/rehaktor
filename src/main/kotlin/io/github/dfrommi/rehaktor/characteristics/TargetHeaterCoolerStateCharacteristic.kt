// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any

public open class TargetHeaterCoolerStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TargetHeaterCoolerStateCharacteristic.Enum>(
    type = "000000B2-0000-1000-8000-0026BB765291",
    description = "Target Heater Cooler State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    AUTO,
    HEAT,
    COOL,
  }
}
