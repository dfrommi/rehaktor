// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class CurrentHorizontalTiltAngleCharacteristic(values: Flux<Int>) : IntegerReactiveCharacteristic(
  type = "0000006C-0000-1000-8000-0026BB765291",
  description = "Current Horizontal Tilt Angle",
  minValue = -90,
  maxValue = 90,
  minStep = 1,
  unit = ValueUnit.ARCDEGREES,
  format = Format.INT32,
  values = values,
  isObservable = true
)
