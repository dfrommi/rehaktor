// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Double

public open class TargetTemperatureCharacteristic(
  values: Flux<Double>,
  setter: (Double) -> Any?
) : DoubleReactiveCharacteristic(
  type = "00000035-0000-1000-8000-0026BB765291",
  description = "Target Temperature", minValue = 10.0, maxValue = 38.0, minStep = 0.1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.CELSIUS, values = values, setter = setter,
  isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value), {})
}
