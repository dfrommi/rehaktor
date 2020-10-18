// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class HardwareRevisionCharacteristic(value: String) : StringReactiveCharacteristic(
  type = "00000053-0000-1000-8000-0026BB765291",
  description = "Hardware Revision",
  values = Flux.just(value),
  isObservable = false
)
