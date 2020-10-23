// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.ByteArray

public open class DisplayOrderCharacteristic(
  values: Flux<ByteArray>,
  setter: (ByteArray) -> Any?
) : TlvReactiveCharacteristic(
  type = "00000136-0000-1000-8000-0026BB765291",
  description = "Display Order", values = values, setter = setter, isObservable = true
) {
  public constructor(value: ByteArray) : this(Flux.just(value), {})
}
