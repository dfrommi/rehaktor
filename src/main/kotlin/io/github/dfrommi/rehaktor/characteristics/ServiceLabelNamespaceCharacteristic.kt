// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class ServiceLabelNamespaceCharacteristic(
  value: Enum
) :
  EnumReactiveCharacteristic<ServiceLabelNamespaceCharacteristic.Enum>(
    type = "000000CD-0000-1000-8000-0026BB765291",
    description = "Service Label Namespace", enumClass = Enum::class, values = Flux.just(value),
    isObservable = false
  ) {
  public enum class Enum {
    DOTS,
    ARABIC_NUMERALS,
    ;

    public fun toBoolean() = this == ARABIC_NUMERALS

    public companion object {
      public fun from(v: Boolean) = if (v) ARABIC_NUMERALS else DOTS
    }
  }
}
