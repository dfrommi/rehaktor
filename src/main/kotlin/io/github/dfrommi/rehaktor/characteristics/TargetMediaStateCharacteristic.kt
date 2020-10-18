// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetMediaStateCharacteristic(values: Flux<TargetMediaStateCharacteristic.Enum>, setter: (TargetMediaStateCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TargetMediaStateCharacteristic.Enum>(
  type = "00000137-0000-1000-8000-0026BB765291",
  description = "Target Media State",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    PLAY,
    PAUSE,
    STOP;
  } 
}
