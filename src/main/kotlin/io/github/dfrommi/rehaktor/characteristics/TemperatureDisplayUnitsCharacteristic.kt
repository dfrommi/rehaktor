// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TemperatureDisplayUnitsCharacteristic(values: Flux<TemperatureDisplayUnitsCharacteristic.Enum>, setter: (TemperatureDisplayUnitsCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<TemperatureDisplayUnitsCharacteristic.Enum>(
  type = "00000036-0000-1000-8000-0026BB765291",
  description = "Temperature Display Units",
  enumClass = Enum::class,
  values = values,
  setter = setter,
  isObservable = true
) {
  enum class Enum {
    CELSIUS,
    FAHRENHEIT;fun toBoolean() = this == FAHRENHEIT

    companion object {
      fun from(v: Boolean) = if (v) FAHRENHEIT else CELSIUS
    } 
  } 
}
