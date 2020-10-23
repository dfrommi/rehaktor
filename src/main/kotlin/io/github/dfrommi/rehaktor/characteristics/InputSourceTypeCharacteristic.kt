// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class InputSourceTypeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<InputSourceTypeCharacteristic.Enum>(
    type = "000000DB-0000-1000-8000-0026BB765291",
    description = "Input Source Type", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    OTHER,
    HOME_SCREEN,
    TUNER,
    HDMI,
    COMPOSITE_VIDEO,
    S_VIDEO,
    COMPONENTVIDEO,
    DVI,
    AIRPLAY,
    USB,
    APPLICATION,
  }
}
