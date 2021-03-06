// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.BooleanReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class MotionDetectedCharacteristic(
  values: Flux<Boolean>
) : BooleanReactiveCharacteristic(
  type = "00000022-0000-1000-8000-0026BB765291",
  description = "Motion Detected", values = values, isObservable = true
) {
  public constructor(value: Boolean) : this(Flux.just(value))
}
