// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentHumidifierDehumidifierStateCharacteristic(values: Flux<CurrentHumidifierDehumidifierStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentHumidifierDehumidifierStateCharacteristic.Enum>(
  type = "000000B3-0000-1000-8000-0026BB765291",
  description = "Current Humidifier Dehumidifier State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    INACTIVE,
    IDLE,
    HUMIDIFYING,
    DEHUMIDIFYING;
  } 
}
