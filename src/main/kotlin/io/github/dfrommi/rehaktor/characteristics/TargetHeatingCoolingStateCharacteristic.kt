// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetHeatingCoolingStateCharacteristic(values: Flux<TargetHeatingCoolingStateCharacteristic.Enum>, setter: (TargetHeatingCoolingStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetHeatingCoolingStateCharacteristic.Enum>(
  type = "00000033-0000-1000-8000-0026BB765291",
  description = "Target Heating Cooling State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    OFF,
    HEAT,
    COOL,
    AUTO;
  } 
}
