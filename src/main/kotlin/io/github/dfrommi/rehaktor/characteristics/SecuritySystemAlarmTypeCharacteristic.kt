// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class SecuritySystemAlarmTypeCharacteristic(
  values: Flux<Int>
) : IntegerReactiveCharacteristic(
  type = "0000008E-0000-1000-8000-0026BB765291",
  description = "Security System Alarm Type", minValue = 0, maxValue = 1, minStep = 1,
  format = io.github.dfrommi.rehaktor.core.Format.UINT8, values = values, isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value))
}
