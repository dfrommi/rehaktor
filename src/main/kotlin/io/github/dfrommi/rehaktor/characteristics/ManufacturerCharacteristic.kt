// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ManufacturerCharacteristic(value: String) : StringReactiveCharacteristic(
  type = "00000020-0000-1000-8000-0026BB765291",
  description = "Manufacturer",
  values = Flux.just(value),
  isObservable = false
)
