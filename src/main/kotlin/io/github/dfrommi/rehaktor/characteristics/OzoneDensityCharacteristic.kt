// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Double

public open class OzoneDensityCharacteristic(
  values: Flux<Double>
) : DoubleReactiveCharacteristic(
  type = "000000C3-0000-1000-8000-0026BB765291",
  description = "Ozone Density", minValue = 0.0, maxValue = 1000.0, minStep = 1.0, values = values,
  isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value))
}
