// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.StringReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.String

public open class SerialNumberCharacteristic(
  value: String
) : StringReactiveCharacteristic(
  type = "00000030-0000-1000-8000-0026BB765291",
  description = "Serial Number", values = Flux.just(value), isObservable = false
)
