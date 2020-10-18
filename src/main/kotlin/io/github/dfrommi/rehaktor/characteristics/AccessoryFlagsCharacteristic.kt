// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class AccessoryFlagsCharacteristic(values: Flux<Int>) : IntegerReactiveCharacteristic(
  type = "000000A6-0000-1000-8000-0026BB765291",
  description = "Accessory Flags",
  format = Format.UINT32,
  values = values,
  isObservable = true
)
