// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ImageRotationCharacteristic(values: Flux<Double>, setter: (Double) -> Any?) : DoubleReactiveCharacteristic(
  type = "0000011E-0000-1000-8000-0026BB765291",
  description = "Image Rotation",
  minValue = 0.0,
  maxValue = 270.0,
  minStep = 90.0,
  unit = ValueUnit.ARCDEGREES,
  values = values,
  setter = setter,
  isObservable = true
)
