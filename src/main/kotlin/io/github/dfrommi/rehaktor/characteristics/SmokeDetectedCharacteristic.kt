// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class SmokeDetectedCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<SmokeDetectedCharacteristic.Enum>(
    type = "00000076-0000-1000-8000-0026BB765291",
    description = "Smoke Detected", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    SMOKE_NOT_DETECTED,
    SMOKE_DETECTED,
    ;

    public fun toBoolean() = this == SMOKE_DETECTED

    public companion object {
      public fun from(v: Boolean) = if (v) SMOKE_DETECTED else SMOKE_NOT_DETECTED
    }
  }
}
