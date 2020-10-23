// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class AirParticulateSizeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<AirParticulateSizeCharacteristic.Enum>(
    type = "00000065-0000-1000-8000-0026BB765291",
    description = "Air Particulate Size", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    `2_5_ΜM`,
    `10_ΜM`,
    ;

    public fun toBoolean() = this == `10_ΜM`

    public companion object {
      public fun from(v: Boolean) = if (v) `10_ΜM` else `2_5_ΜM`
    }
  }
}
