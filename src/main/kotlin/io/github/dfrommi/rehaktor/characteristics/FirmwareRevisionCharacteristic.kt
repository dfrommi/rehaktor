// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class FirmwareRevisionCharacteristic(value: String) : StringReactiveCharacteristic(
  type = "00000052-0000-1000-8000-0026BB765291",
  description = "Firmware Revision",
  values = Flux.just(value),
  isObservable = false
)
