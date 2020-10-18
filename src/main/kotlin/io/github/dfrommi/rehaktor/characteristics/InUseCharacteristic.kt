// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class InUseCharacteristic(values: Flux<InUseCharacteristic.Enum>) : EnumReactiveCharacteristic<InUseCharacteristic.Enum>(
  type = "000000D2-0000-1000-8000-0026BB765291",
  description = "In Use",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    NOT_IN_USE,
    IN_USE;fun toBoolean() = this == IN_USE

    companion object {
      fun from(v: Boolean) = if (v) IN_USE else NOT_IN_USE
    } 
  } 
}
