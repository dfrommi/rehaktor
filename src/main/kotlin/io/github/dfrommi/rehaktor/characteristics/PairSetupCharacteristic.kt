// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.ByteArray

public open class PairSetupCharacteristic(
  value: ByteArray,
  setter: (ByteArray) -> Any?
) : TlvReactiveCharacteristic(
  type = "0000004C-0000-1000-8000-0026BB765291", description = "Pair Setup",
  values = Flux.just(value), setter = setter, isObservable = false
)
