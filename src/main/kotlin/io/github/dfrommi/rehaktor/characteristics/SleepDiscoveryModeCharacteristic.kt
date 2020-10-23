// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class SleepDiscoveryModeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<SleepDiscoveryModeCharacteristic.Enum>(
    type = "000000E8-0000-1000-8000-0026BB765291",
    description = "Sleep Discovery Mode", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NOT_DISCOVERABLE,
    ALWAYS_DISCOVERABLE,
    ;

    public fun toBoolean() = this == ALWAYS_DISCOVERABLE

    public companion object {
      public fun from(v: Boolean) = if (v) ALWAYS_DISCOVERABLE else NOT_DISCOVERABLE
    }
  }
}
