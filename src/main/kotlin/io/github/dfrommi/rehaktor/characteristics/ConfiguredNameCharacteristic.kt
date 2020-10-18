// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ConfiguredNameCharacteristic(values: Flux<String>, setter: (String) -> Any?) : StringReactiveCharacteristic(
  type = "000000E3-0000-1000-8000-0026BB765291",
  description = "Configured Name",
  values = values,
  setter = setter,
  isObservable = true
)
