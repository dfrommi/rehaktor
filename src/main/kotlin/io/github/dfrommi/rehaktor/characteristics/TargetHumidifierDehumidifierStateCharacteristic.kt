// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetHumidifierDehumidifierStateCharacteristic(values: Flux<TargetHumidifierDehumidifierStateCharacteristic.Enum>, setter: (TargetHumidifierDehumidifierStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetHumidifierDehumidifierStateCharacteristic.Enum>(
  type = "000000B4-0000-1000-8000-0026BB765291",
  description = "Target Humidifier Dehumidifier State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    HUMIDIFIER_OR_DEHUMIDIFIER,
    HUMIDIFIER,
    DEHUMIDIFIER;
  } 
}
