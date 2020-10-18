// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class BatteryLevelCharacteristic(values: Flux<Int>) : IntegerReactiveCharacteristic(
  type = "00000068-0000-1000-8000-0026BB765291",
  description = "Battery Level",
  minValue = 0,
  maxValue = 100,
  minStep = 1,
  unit = ValueUnit.PERCENTAGE,
  format = Format.UINT8,
  values = values,
  isObservable = true
)
