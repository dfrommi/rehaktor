// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class StatusActiveCharacteristic(values: Flux<Boolean>) : BooleanReactiveCharacteristic(
  type = "00000075-0000-1000-8000-0026BB765291",
  description = "Status Active",
  values = values,
  isObservable = true
)
