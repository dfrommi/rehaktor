// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class InputSourceTypeCharacteristic(values: Flux<InputSourceTypeCharacteristic.Enum>) : EnumReactiveCharacteristic<InputSourceTypeCharacteristic.Enum>(
  type = "000000DB-0000-1000-8000-0026BB765291",
  description = "Input Source Type",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
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
    APPLICATION;
  } 
}
