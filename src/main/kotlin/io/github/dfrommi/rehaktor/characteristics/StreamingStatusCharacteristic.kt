// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class StreamingStatusCharacteristic(values: Flux<ByteArray>) : TlvReactiveCharacteristic(
  type = "00000120-0000-1000-8000-0026BB765291",
  description = "Streaming Status",
  values = values,
  isObservable = true
)
