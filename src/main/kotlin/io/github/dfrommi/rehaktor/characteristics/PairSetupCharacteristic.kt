// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PairSetupCharacteristic(value: ByteArray, setter: (ByteArray) -> Any?) : TlvReactiveCharacteristic(
  type = "0000004C-0000-1000-8000-0026BB765291",
  description = "Pair Setup",
  values = Flux.just(value),
  setter = setter,
  isObservable = false
)
