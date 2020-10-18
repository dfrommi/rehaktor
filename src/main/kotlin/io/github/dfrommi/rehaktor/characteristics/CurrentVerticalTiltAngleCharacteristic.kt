// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentVerticalTiltAngleCharacteristic(values: Flux<Int>) : IntegerReactiveCharacteristic(
  type = "0000006E-0000-1000-8000-0026BB765291",
  description = "Current Vertical Tilt Angle",
  minValue = -90,
  maxValue = 90,
  minStep = 1,
  unit = ValueUnit.ARCDEGREES,
  format = Format.INT32,
  values = values,
  isObservable = true
)
