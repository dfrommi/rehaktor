// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class IdentifierCharacteristic(
  value: Int
) : IntegerReactiveCharacteristic(
  type = "000000E6-0000-1000-8000-0026BB765291",
  description = "Identifier", minValue = 0, minStep = 1,
  format = io.github.dfrommi.rehaktor.core.Format.UINT32, values = Flux.just(value),
  isObservable = false
)
