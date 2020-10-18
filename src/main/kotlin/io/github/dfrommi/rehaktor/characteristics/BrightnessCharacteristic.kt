// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class BrightnessCharacteristic(values: Flux<Int>, setter: (Int) -> Any?) : IntegerReactiveCharacteristic(
  type = "00000008-0000-1000-8000-0026BB765291",
  description = "Brightness",
  minValue = 0,
  maxValue = 100,
  minStep = 1,
  unit = ValueUnit.PERCENTAGE,
  format = Format.INT32,
  values = values,
  setter = setter,
  isObservable = true
)
