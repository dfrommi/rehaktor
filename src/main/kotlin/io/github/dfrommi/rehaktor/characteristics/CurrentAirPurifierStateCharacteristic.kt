// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentAirPurifierStateCharacteristic(values: Flux<CurrentAirPurifierStateCharacteristic.Enum>) : EnumReactiveCharacteristic<CurrentAirPurifierStateCharacteristic.Enum>(
  type = "000000A9-0000-1000-8000-0026BB765291",
  description = "Current Air Purifier State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    INACTIVE,
    IDLE,
    PURIFYING_AIR;
  } 
}
