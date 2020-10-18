// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PairVerifyCharacteristic(value: ByteArray, setter: (ByteArray) -> Any?) : TlvReactiveCharacteristic(
  type = "0000004E-0000-1000-8000-0026BB765291",
  description = "Pair Verify",
  values = Flux.just(value),
  setter = setter,
  isObservable = false
)
