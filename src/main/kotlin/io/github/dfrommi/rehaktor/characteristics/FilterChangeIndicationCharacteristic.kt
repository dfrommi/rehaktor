// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class FilterChangeIndicationCharacteristic(values: Flux<FilterChangeIndicationCharacteristic.Enum>) : EnumReactiveCharacteristic<FilterChangeIndicationCharacteristic.Enum>(
  type = "000000AC-0000-1000-8000-0026BB765291",
  description = "Filter Change Indication",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    FILTER_OK,
    CHANGE_FILTER;fun toBoolean() = this == CHANGE_FILTER

    companion object {
      fun from(v: Boolean) = if (v) CHANGE_FILTER else FILTER_OK
    } 
  } 
}
