// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class VolumeControlTypeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<VolumeControlTypeCharacteristic.Enum>(
    type = "000000E9-0000-1000-8000-0026BB765291",
    description = "Volume Control Type", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NONE,
    RELATIVE,
    RELATIVE_WITH_CURRENT,
    ABSOLUTE,
  }
}
