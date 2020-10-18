// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class OpticalZoomCharacteristic(values: Flux<Double>, setter: (Double) -> Any?) : DoubleReactiveCharacteristic(
  type = "0000011C-0000-1000-8000-0026BB765291",
  description = "Optical Zoom",
  values = values,
  setter = setter,
  isObservable = true
)
