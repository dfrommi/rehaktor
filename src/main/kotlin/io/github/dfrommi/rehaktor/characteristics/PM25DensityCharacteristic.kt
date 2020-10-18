// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class PM25DensityCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "000000C6-0000-1000-8000-0026BB765291",
  description = "PM2.5 Density",
  minValue = 0.0,
  maxValue = 1000.0,
  minStep = 1.0,
  values = values,
  isObservable = true
)
