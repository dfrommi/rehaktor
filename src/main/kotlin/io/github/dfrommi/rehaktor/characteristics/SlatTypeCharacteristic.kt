// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SlatTypeCharacteristic(value: SlatTypeCharacteristic.Enum) : EnumReactiveCharacteristic<SlatTypeCharacteristic.Enum>(
  type = "000000C0-0000-1000-8000-0026BB765291",
  description = "Slat Type",
  enumClass = Enum::class,
  values = Flux.just(value),
  isObservable = false
) {
  enum class Enum {
    HORIZONTAL,
    VERTICAL;fun toBoolean() = this == VERTICAL

    companion object {
      fun from(v: Boolean) = if (v) VERTICAL else HORIZONTAL
    } 
  } 
}
