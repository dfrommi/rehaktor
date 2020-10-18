// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class IsConfiguredCharacteristic(values: Flux<IsConfiguredCharacteristic.Enum>, setter: (IsConfiguredCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<IsConfiguredCharacteristic.Enum>(
  type = "000000D6-0000-1000-8000-0026BB765291",
  description = "Is Configured",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    NOT_CONFIGURED,
    CONFIGURED;fun toBoolean() = this == CONFIGURED

    companion object {
      fun from(v: Boolean) = if (v) CONFIGURED else NOT_CONFIGURED
    } 
  } 
}
