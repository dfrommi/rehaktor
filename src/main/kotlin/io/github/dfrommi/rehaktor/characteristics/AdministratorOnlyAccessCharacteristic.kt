// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class AdministratorOnlyAccessCharacteristic(values: Flux<Boolean>, setter: (Boolean) -> Any?) : BooleanReactiveCharacteristic(
  type = "00000001-0000-1000-8000-0026BB765291",
  description = "Administrator Only Access",
  values = values,
  setter = setter,
  isObservable = true
)
