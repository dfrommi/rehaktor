// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SaturationCharacteristic(values: Flux<Double>, setter: (Double) -> Any?) : DoubleReactiveCharacteristic(
  type = "0000002F-0000-1000-8000-0026BB765291",
  description = "Saturation",
  minValue = 0.0,
  maxValue = 100.0,
  minStep = 1.0,
  unit = ValueUnit.PERCENTAGE,
  values = values,
  setter = setter,
  isObservable = true
)
