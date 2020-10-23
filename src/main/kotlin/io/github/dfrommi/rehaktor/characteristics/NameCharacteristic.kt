// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.StringReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.String

public open class NameCharacteristic(
  value: String
) : StringReactiveCharacteristic(
  type = "00000023-0000-1000-8000-0026BB765291", description = "Name",
  values = Flux.just(value), isObservable = false
)
