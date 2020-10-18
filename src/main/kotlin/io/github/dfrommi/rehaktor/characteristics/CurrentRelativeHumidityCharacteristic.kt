// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentRelativeHumidityCharacteristic(values: Flux<Double>) : DoubleReactiveCharacteristic(
  type = "00000010-0000-1000-8000-0026BB765291",
  description = "Current Relative Humidity",
  minValue = 0.0,
  maxValue = 100.0,
  minStep = 1.0,
  unit = ValueUnit.PERCENTAGE,
  values = values,
  isObservable = true
)
