// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Double

public open class RelativeHumidityHumidifierThresholdCharacteristic(
  values: Flux<Double>,
  setter: (Double) -> Any?
) : DoubleReactiveCharacteristic(
  type = "000000CA-0000-1000-8000-0026BB765291",
  description = "Relative Humidity Humidifier Threshold", minValue = 0.0, maxValue = 100.0, minStep = 1.0,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.PERCENTAGE, values = values, setter = setter,
  isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value), {})
}
