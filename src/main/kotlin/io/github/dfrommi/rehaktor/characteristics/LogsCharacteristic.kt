// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.ByteArray

public open class LogsCharacteristic(
  values: Flux<ByteArray>
) : TlvReactiveCharacteristic(
  type = "0000001F-0000-1000-8000-0026BB765291", description = "Logs",
  values = values, isObservable = true
) {
  public constructor(value: ByteArray) : this(Flux.just(value))
}
