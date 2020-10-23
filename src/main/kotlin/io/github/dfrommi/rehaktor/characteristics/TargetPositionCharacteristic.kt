// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Int

public open class TargetPositionCharacteristic(
  values: Flux<Int>,
  setter: (Int) -> Any?
) : IntegerReactiveCharacteristic(
  type = "0000007C-0000-1000-8000-0026BB765291",
  description = "Target Position", minValue = 0, maxValue = 100, minStep = 1,
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.PERCENTAGE,
  format = io.github.dfrommi.rehaktor.core.Format.UINT8, values = values, setter = setter,
  isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value), {})
}
