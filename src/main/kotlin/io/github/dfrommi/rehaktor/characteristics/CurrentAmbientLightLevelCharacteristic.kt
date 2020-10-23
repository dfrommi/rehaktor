// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Double

public open class CurrentAmbientLightLevelCharacteristic(
  values: Flux<Double>
) : DoubleReactiveCharacteristic(
  type = "0000006B-0000-1000-8000-0026BB765291",
  description = "Current Ambient Light Level", minValue = 1.0E-4, maxValue = 100000.0,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.LUX, values = values, isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value))
}
