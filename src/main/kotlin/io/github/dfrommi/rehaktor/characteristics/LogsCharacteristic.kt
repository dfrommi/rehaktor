// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class LogsCharacteristic(values: Flux<ByteArray>) : TlvReactiveCharacteristic(
  type = "0000001F-0000-1000-8000-0026BB765291",
  description = "Logs",
  values = values,
  isObservable = true
)
