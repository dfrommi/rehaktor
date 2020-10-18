// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class VolumeControlTypeCharacteristic(values: Flux<VolumeControlTypeCharacteristic.Enum>) : EnumReactiveCharacteristic<VolumeControlTypeCharacteristic.Enum>(
  type = "000000E9-0000-1000-8000-0026BB765291",
  description = "Volume Control Type",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NONE,
    RELATIVE,
    RELATIVE_WITH_CURRENT,
    ABSOLUTE;
  } 
}
