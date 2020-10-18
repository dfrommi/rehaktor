// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class FilterLifeLevelCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "000000AB-0000-1000-8000-0026BB765291",
  description = "Filter Life Level",
  minValue = 0.0,
  maxValue = 100.0,
  values = values,
  isObservable = true
)
