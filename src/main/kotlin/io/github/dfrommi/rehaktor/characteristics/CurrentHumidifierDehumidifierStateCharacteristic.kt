// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class CurrentHumidifierDehumidifierStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<CurrentHumidifierDehumidifierStateCharacteristic.Enum>(
    type = "000000B3-0000-1000-8000-0026BB765291",
    description = "Current Humidifier Dehumidifier State", enumClass = Enum::class, values = values,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    INACTIVE,
    IDLE,
    HUMIDIFYING,
    DEHUMIDIFYING,
  }
}
