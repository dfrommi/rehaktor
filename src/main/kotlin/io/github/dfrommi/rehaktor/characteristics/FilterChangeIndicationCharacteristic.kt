// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class FilterChangeIndicationCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<FilterChangeIndicationCharacteristic.Enum>(
    type = "000000AC-0000-1000-8000-0026BB765291",
    description = "Filter Change Indication", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    FILTER_OK,
    CHANGE_FILTER,
    ;

    public fun toBoolean() = this == CHANGE_FILTER

    public companion object {
      public fun from(v: Boolean) = if (v) CHANGE_FILTER else FILTER_OK
    }
  }
}
