// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class SlatTypeCharacteristic(
  value: Enum
) :
  EnumReactiveCharacteristic<SlatTypeCharacteristic.Enum>(
    type = "000000C0-0000-1000-8000-0026BB765291",
    description = "Slat Type", enumClass = Enum::class, values = Flux.just(value), isObservable = false
  ) {
  public enum class Enum {
    HORIZONTAL,
    VERTICAL,
    ;

    public fun toBoolean() = this == VERTICAL

    public companion object {
      public fun from(v: Boolean) = if (v) VERTICAL else HORIZONTAL
    }
  }
}
