// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class TargetHorizontalTiltAngleCharacteristic(values: Flux<Int>, setter: (Int) -> Any?) : IntegerReactiveCharacteristic(
  type = "0000007B-0000-1000-8000-0026BB765291",
  description = "Target Horizontal Tilt Angle",
  minValue = -90,
  maxValue = 90,
  minStep = 1,
  unit = ValueUnit.ARCDEGREES,
  format = Format.INT32,
  values = values,
  setter = setter,
  isObservable = true
)
