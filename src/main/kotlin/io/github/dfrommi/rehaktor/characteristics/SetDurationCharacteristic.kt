// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SetDurationCharacteristic(values: Flux<Int>, setter: (Int) -> Any?) : IntegerReactiveCharacteristic(
  type = "000000D3-0000-1000-8000-0026BB765291",
  description = "Set Duration",
  minValue = 0,
  maxValue = 3600,
  minStep = 1,
  format = Format.UINT32,
  values = values,
  setter = setter,
  isObservable = true
)
