// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class ServiceLabelIndexCharacteristic(
  value: Int
) : IntegerReactiveCharacteristic(
  type = "000000CB-0000-1000-8000-0026BB765291",
  description = "Service Label Index", minValue = 1, maxValue = 255, minStep = 1,
  format = io.github.dfrommi.rehaktor.core.Format.UINT8, values = Flux.just(value),
  isObservable = false
)
