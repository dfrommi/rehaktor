// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PM10DensityCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "000000C7-0000-1000-8000-0026BB765291",
  description = "PM10 Density",
  minValue = 0.0,
  maxValue = 1000.0,
  minStep = 1.0,
  values = values,
  isObservable = true
)
