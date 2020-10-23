// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any

public open class TargetHeatingCoolingStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TargetHeatingCoolingStateCharacteristic.Enum>(
    type = "00000033-0000-1000-8000-0026BB765291",
    description = "Target Heating Cooling State", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    OFF,
    HEAT,
    COOL,
    AUTO,
  }
}
