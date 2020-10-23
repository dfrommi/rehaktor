// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class InUseCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<InUseCharacteristic.Enum>(
    type = "000000D2-0000-1000-8000-0026BB765291",
    description = "In Use", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    NOT_IN_USE,
    IN_USE,
    ;

    public fun toBoolean() = this == IN_USE

    public companion object {
      public fun from(v: Boolean) = if (v) IN_USE else NOT_IN_USE
    }
  }
}
