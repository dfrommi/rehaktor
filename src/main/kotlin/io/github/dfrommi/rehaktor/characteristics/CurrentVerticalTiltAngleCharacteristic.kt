// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class CurrentVerticalTiltAngleCharacteristic(
  values: Flux<Int>
) : IntegerReactiveCharacteristic(
  type = "0000006E-0000-1000-8000-0026BB765291",
  description = "Current Vertical Tilt Angle", minValue = -90, maxValue = 90, minStep = 1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.ARCDEGREES,
  format = io.github.dfrommi.rehaktor.core.Format.INT32, values = values, isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value))
}
