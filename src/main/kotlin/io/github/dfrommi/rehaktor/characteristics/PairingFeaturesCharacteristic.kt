// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PairingFeaturesCharacteristic(value: Int) : IntegerReactiveCharacteristic(
  type = "0000004F-0000-1000-8000-0026BB765291",
  description = "Pairing Features",
  format = Format.UINT8,
  values = Flux.just(value),
  isObservable = false
)
