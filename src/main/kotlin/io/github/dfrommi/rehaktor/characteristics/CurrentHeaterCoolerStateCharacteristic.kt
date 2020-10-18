// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentHeaterCoolerStateCharacteristic(values: Flux<CurrentHeaterCoolerStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentHeaterCoolerStateCharacteristic.Enum>(
  type = "000000B1-0000-1000-8000-0026BB765291",
  description = "Current Heater Cooler State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    INACTIVE,
    IDLE,
    HEATING,
    COOLING;
  } 
}
