// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CarbonDioxidePeakLevelCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "00000094-0000-1000-8000-0026BB765291",
  description = "Carbon Dioxide Peak Level",
  minValue = 0.0,
  maxValue = 100000.0,
  values = values,
  isObservable = true
)
