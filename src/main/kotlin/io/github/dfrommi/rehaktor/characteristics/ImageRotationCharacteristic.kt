// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.DoubleReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Double

public open class ImageRotationCharacteristic(
  values: Flux<Double>,
  setter: (Double) -> Any?
) : DoubleReactiveCharacteristic(
  type = "0000011E-0000-1000-8000-0026BB765291",
  description = "Image Rotation", minValue = 0.0, maxValue = 270.0, minStep = 90.0,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.ARCDEGREES, values = values, setter = setter,
  isObservable = true
) {
  public constructor(value: Double) : this(Flux.just(value), {})
}
