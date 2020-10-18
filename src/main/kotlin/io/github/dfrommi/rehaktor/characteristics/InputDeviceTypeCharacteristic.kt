// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class InputDeviceTypeCharacteristic(values: Flux<InputDeviceTypeCharacteristic.Enum>) : EnumReactiveCharacteristic<InputDeviceTypeCharacteristic.Enum>(
  type = "000000DC-0000-1000-8000-0026BB765291",
  description = "Input Device Type",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    OTHER,
    TV,
    RECORDING,
    TUNER,
    PLAYBACK,
    AUDIO_SYSTEM;
  } 
}
