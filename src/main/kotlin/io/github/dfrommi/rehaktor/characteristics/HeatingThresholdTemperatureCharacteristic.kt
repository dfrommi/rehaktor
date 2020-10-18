// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class HeatingThresholdTemperatureCharacteristic(values: Flux<Double>, setter: (Double) -> Any?) : DoubleReactiveCharacteristic(
  type = "00000012-0000-1000-8000-0026BB765291",
  description = "Heating Threshold Temperature",
  minValue = 0.0,
  maxValue = 25.0,
  minStep = 0.1,
  unit = ValueUnit.CELSIUS,
  values = values,
  setter = setter,
  isObservable = true
)
