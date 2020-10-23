// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class RemainingDurationCharacteristic(
  values: Flux<Int>
) : IntegerReactiveCharacteristic(
  type = "000000D4-0000-1000-8000-0026BB765291",
  description = "Remaining Duration", minValue = 0, maxValue = 3600, minStep = 1,
  format = io.github.dfrommi.rehaktor.core.Format.UINT32, values = values, isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value))
}
