// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetHeaterCoolerStateCharacteristic(values: Flux<TargetHeaterCoolerStateCharacteristic.Enum>, setter: (TargetHeaterCoolerStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetHeaterCoolerStateCharacteristic.Enum>(
  type = "000000B2-0000-1000-8000-0026BB765291",
  description = "Target Heater Cooler State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    AUTO,
    HEAT,
    COOL;
  } 
}
