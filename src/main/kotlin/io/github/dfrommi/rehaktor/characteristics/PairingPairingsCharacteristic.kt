// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.ByteArray

public open class PairingPairingsCharacteristic(
  value: ByteArray,
  setter: (ByteArray) -> Any?
) : TlvReactiveCharacteristic(
  type = "00000050-0000-1000-8000-0026BB765291",
  description = "Pairing Pairings", values = Flux.just(value), setter = setter, isObservable = false
)
