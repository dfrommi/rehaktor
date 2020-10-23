// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Int

public open class BatteryLevelCharacteristic(
  values: Flux<Int>
) : IntegerReactiveCharacteristic(
  type = "00000068-0000-1000-8000-0026BB765291",
  description = "Battery Level", minValue = 0, maxValue = 100, minStep = 1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.PERCENTAGE,
  format = io.github.dfrommi.rehaktor.core.Format.UINT8, values = values, isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value))
}
