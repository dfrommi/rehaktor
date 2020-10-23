// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.BooleanReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class AdministratorOnlyAccessCharacteristic(
  values: Flux<Boolean>,
  setter: (Boolean) -> Any?
) : BooleanReactiveCharacteristic(
  type = "00000001-0000-1000-8000-0026BB765291",
  description = "Administrator Only Access", values = values, setter = setter, isObservable = true
) {
  public constructor(value: Boolean) : this(Flux.just(value), {})
}
