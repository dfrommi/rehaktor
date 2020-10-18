// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class NightVisionCharacteristic(values: Flux<Boolean>, setter: (Boolean) -> Any?) : BooleanReactiveCharacteristic(
  type = "0000011B-0000-1000-8000-0026BB765291",
  description = "Night Vision",
  values = values,
  setter = setter,
  isObservable = true
)
