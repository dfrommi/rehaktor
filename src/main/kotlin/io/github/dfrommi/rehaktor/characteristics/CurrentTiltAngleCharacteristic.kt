// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class CurrentTiltAngleCharacteristic(
  values: Flux<Int>
) : IntegerReactiveCharacteristic(
  type = "000000C1-0000-1000-8000-0026BB765291",
  description = "Current Tilt Angle", minValue = -90, maxValue = 90, minStep = 1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.ARCDEGREES,
  format = io.github.dfrommi.rehaktor.core.Format.INT32, values = values, isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value))
}
