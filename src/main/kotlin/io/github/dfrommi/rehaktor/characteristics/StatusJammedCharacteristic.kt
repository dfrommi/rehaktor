// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class StatusJammedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<StatusJammedCharacteristic.Enum>(
    type = "00000078-0000-1000-8000-0026BB765291",
    description = "Status Jammed", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NOT_JAMMED,
    JAMMED,
    ;

    public fun toBoolean() = this == JAMMED

    public companion object {
      public fun from(v: Boolean) = if (v) JAMMED else NOT_JAMMED
    }
  }
}
