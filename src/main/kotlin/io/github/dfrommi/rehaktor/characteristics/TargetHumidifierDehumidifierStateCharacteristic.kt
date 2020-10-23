// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any

public open class TargetHumidifierDehumidifierStateCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<TargetHumidifierDehumidifierStateCharacteristic.Enum>(
    type = "000000B4-0000-1000-8000-0026BB765291",
    description = "Target Humidifier Dehumidifier State", enumClass = Enum::class, values = values,
    setter = setter, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    HUMIDIFIER_OR_DEHUMIDIFIER,
    HUMIDIFIER,
    DEHUMIDIFIER,
  }
}
