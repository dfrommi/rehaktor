// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Double

public open class CurrentTemperatureCharacteristic(
  values: Flux<Double>
) : DoubleReactiveCharacteristic(
  type = "00000011-0000-1000-8000-0026BB765291",
  description = "Current Temperature", minValue = 0.0, maxValue = 100.0, minStep = 0.1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.CELSIUS, values = values, isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value))
}
