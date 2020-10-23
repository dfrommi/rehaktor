// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.ByteArray

public open class StreamingStatusCharacteristic(
  values: Flux<ByteArray>
) : TlvReactiveCharacteristic(
  type = "00000120-0000-1000-8000-0026BB765291",
  description = "Streaming Status", values = values, isObservable = true
) {
  public constructor(value: ByteArray) : this(Flux.just(value))
}
