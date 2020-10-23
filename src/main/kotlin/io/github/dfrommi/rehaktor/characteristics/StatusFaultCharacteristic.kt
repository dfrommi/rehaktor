// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class StatusFaultCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<StatusFaultCharacteristic.Enum>(
    type = "00000077-0000-1000-8000-0026BB765291",
    description = "Status Fault", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NO_FAULT,
    GENERAL_FAULT,
    ;

    public fun toBoolean() = this == GENERAL_FAULT

    public companion object {
      public fun from(v: Boolean) = if (v) GENERAL_FAULT else NO_FAULT
    }
  }
}
