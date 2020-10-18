// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ImageMirroringCharacteristic(values: Flux<Boolean>, setter: (Boolean) -> Any?) : BooleanReactiveCharacteristic(
  type = "0000011F-0000-1000-8000-0026BB765291",
  description = "Image Mirroring",
  values = values,
  setter = setter,
  isObservable = true
)
