// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SecuritySystemAlarmTypeCharacteristic(values: Flux<Int>) : IntegerReactiveCharacteristic(
  type = "0000008E-0000-1000-8000-0026BB765291",
  description = "Security System Alarm Type",
  minValue = 0,
  maxValue = 1,
  minStep = 1,
  format = Format.UINT8,
  values = values,
  isObservable = true
)
