// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class LeakDetectedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<LeakDetectedCharacteristic.Enum>(
    type = "00000070-0000-1000-8000-0026BB765291",
    description = "Leak Detected", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    LEAK_NOT_DETECTED,
    LEAK_DETECTED,
    ;

    public fun toBoolean() = this == LEAK_DETECTED

    public companion object {
      public fun from(v: Boolean) = if (v) LEAK_DETECTED else LEAK_NOT_DETECTED
    }
  }
}
