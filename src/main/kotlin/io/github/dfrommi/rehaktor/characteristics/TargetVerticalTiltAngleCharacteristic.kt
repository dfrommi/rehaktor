// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Int

public open class TargetVerticalTiltAngleCharacteristic(
  values: Flux<Int>,
  setter: (Int) -> Any?
) : IntegerReactiveCharacteristic(
  type = "0000007D-0000-1000-8000-0026BB765291",
  description = "Target Vertical Tilt Angle", minValue = -90, maxValue = 90, minStep = 1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.ARCDEGREES,
  format = io.github.dfrommi.rehaktor.core.Format.INT32, values = values, setter = setter,
  isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value), {})
}
