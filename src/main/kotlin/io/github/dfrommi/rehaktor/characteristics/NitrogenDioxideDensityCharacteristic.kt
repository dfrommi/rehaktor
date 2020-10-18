// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class NitrogenDioxideDensityCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "000000C4-0000-1000-8000-0026BB765291",
  description = "Nitrogen Dioxide Density",
  minValue = 0.0,
  maxValue = 1000.0,
  minStep = 1.0,
  values = values,
  isObservable = true
)