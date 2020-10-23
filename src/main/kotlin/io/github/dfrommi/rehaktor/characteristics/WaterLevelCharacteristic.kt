// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Double

public open class WaterLevelCharacteristic(
  values: Flux<Double>
) : DoubleReactiveCharacteristic(
  type = "000000B5-0000-1000-8000-0026BB765291",
  description = "Water Level", minValue = 0.0, maxValue = 100.0,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.PERCENTAGE, values = values, isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value))
}
