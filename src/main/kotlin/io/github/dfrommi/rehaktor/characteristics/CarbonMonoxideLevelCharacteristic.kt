// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CarbonMonoxideLevelCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "00000090-0000-1000-8000-0026BB765291",
  description = "Carbon Monoxide Level",
  minValue = 0.0,
  maxValue = 100.0,
  values = values,
  isObservable = true
)
