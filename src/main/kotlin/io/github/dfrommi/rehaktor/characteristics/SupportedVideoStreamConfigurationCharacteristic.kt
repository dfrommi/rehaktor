// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SupportedVideoStreamConfigurationCharacteristic(value: ByteArray) : TlvReactiveCharacteristic(
  type = "00000114-0000-1000-8000-0026BB765291",
  description = "Supported Video Stream Configuration",
  values = Flux.just(value),
  isObservable = false
)
