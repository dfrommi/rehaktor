// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class StatusTamperedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<StatusTamperedCharacteristic.Enum>(
    type = "0000007A-0000-1000-8000-0026BB765291",
    description = "Status Tampered", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NOT_TAMPERED,
    TAMPERED,
    ;

    public fun toBoolean() = this == TAMPERED

    public companion object {
      public fun from(v: Boolean) = if (v) TAMPERED else NOT_TAMPERED
    }
  }
}
