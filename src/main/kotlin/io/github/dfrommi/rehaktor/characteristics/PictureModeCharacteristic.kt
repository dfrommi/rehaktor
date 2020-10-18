// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PictureModeCharacteristic(values: Flux<PictureModeCharacteristic.Enum>, setter: (PictureModeCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<PictureModeCharacteristic.Enum>(
  type = "000000E2-0000-1000-8000-0026BB765291",
  description = "Picture Mode",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    OTHER,
    STANDARD,
    CALIBRATED,
    CALIBRATED_DARK,
    VIVID,
    GAME,
    COMPUTER,
    CUSTOM,
    UNKNOWN_1,
    UNKNOWN_2,
    UNKNOWN_3,
    UNKNOWN_4,
    UNKNOWN_5,
    UNKNOWN_6;
  } 
}
