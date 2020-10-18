// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetTemperatureCharacteristic(values: Flux<Double>, setter: (Double) -> Any?) : DoubleReactiveCharacteristic(
  type = "00000035-0000-1000-8000-0026BB765291",
  description = "Target Temperature",
  minValue = 10.0,
  maxValue = 38.0,
  minStep = 0.1,
  unit = ValueUnit.CELSIUS,
  values = values,
  setter = setter,
  isObservable = true
)
