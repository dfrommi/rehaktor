// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class DisplayOrderCharacteristic(values: Flux<ByteArray>, setter: (ByteArray) -> Any?) : TlvReactiveCharacteristic(
  type = "00000136-0000-1000-8000-0026BB765291",
  description = "Display Order",
  values = values,
  setter = setter,
  isObservable = true
)
