// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ServiceLabelNamespaceCharacteristic(value: ServiceLabelNamespaceCharacteristic.Enum) : EnumReactiveCharacteristic<ServiceLabelNamespaceCharacteristic.Enum>(
  type = "000000CD-0000-1000-8000-0026BB765291",
  description = "Service Label Namespace",
  enumClass = Enum::class,
  values = Flux.just(value),
  isObservable = false
) {
  enum class Enum {
    DOTS,
    ARABIC_NUMERALS;fun toBoolean() = this == ARABIC_NUMERALS

    companion object {
      fun from(v: Boolean) = if (v) ARABIC_NUMERALS else DOTS
    } 
  } 
}
