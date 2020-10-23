// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any

public open class PictureModeCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<PictureModeCharacteristic.Enum>(
    type = "000000E2-0000-1000-8000-0026BB765291",
    description = "Picture Mode", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
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
    UNKNOWN_6,
  }
}
