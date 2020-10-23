// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class InputDeviceTypeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<InputDeviceTypeCharacteristic.Enum>(
    type = "000000DC-0000-1000-8000-0026BB765291",
    description = "Input Device Type", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    OTHER,
    TV,
    RECORDING,
    TUNER,
    PLAYBACK,
    AUDIO_SYSTEM,
  }
}
