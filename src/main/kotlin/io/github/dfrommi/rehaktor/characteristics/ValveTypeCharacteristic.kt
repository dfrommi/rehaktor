// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ValveTypeCharacteristic(values: Flux<ValveTypeCharacteristic.Enum>) : EnumReactiveCharacteristic<ValveTypeCharacteristic.Enum>(
  type = "000000D5-0000-1000-8000-0026BB765291",
  description = "Valve Type",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    GENERIC_VALVE,
    IRRIGATION,
    SHOWER_HEAD,
    WATER_FAUCET;
  } 
}
