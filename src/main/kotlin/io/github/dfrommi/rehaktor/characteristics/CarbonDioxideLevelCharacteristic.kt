// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Double

public open class CarbonDioxideLevelCharacteristic(
  values: Flux<Double>
) : DoubleReactiveCharacteristic(
  type = "00000093-0000-1000-8000-0026BB765291",
  description = "Carbon Dioxide Level", minValue = 0.0, maxValue = 100000.0, values = values,
  isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value))
}
