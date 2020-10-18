// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentHeatingCoolingStateCharacteristic(values: Flux<CurrentHeatingCoolingStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentHeatingCoolingStateCharacteristic.Enum>(
  type = "0000000F-0000-1000-8000-0026BB765291",
  description = "Current Heating Cooling State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    OFF,
    HEAT,
    COOL;
  } 
}
