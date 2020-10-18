// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class AirParticulateSizeCharacteristic(values: Flux<AirParticulateSizeCharacteristic.Enum>) : EnumReactiveCharacteristic<AirParticulateSizeCharacteristic.Enum>(
  type = "00000065-0000-1000-8000-0026BB765291",
  description = "Air Particulate Size",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    `2_5_ΜM`,
    `10_ΜM`;fun toBoolean() = this == `10_ΜM`

    companion object {
      fun from(v: Boolean) = if (v) `10_ΜM` else `2_5_ΜM`
    } 
  } 
}
