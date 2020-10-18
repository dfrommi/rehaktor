// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ServiceLabelIndexCharacteristic(value: Int) : IntegerReactiveCharacteristic(
  type = "000000CB-0000-1000-8000-0026BB765291",
  description = "Service Label Index",
  minValue = 1,
  maxValue = 255,
  minStep = 1,
  format = Format.UINT8,
  values = Flux.just(value),
  isObservable = false
)
