// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SetupEndpointsCharacteristic(value: ByteArray, setter: (ByteArray) -> Any?) : TlvReactiveCharacteristic(
  type = "00000118-0000-1000-8000-0026BB765291",
  description = "Setup Endpoints",
  values = Flux.just(value),
  setter = setter,
  isObservable = false
)