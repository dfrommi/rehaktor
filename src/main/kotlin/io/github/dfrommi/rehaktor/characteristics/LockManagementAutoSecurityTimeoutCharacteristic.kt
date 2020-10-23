// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Int

public open class LockManagementAutoSecurityTimeoutCharacteristic(
  values: Flux<Int>,
  setter: (Int) -> Any?
) : IntegerReactiveCharacteristic(
  type = "0000001A-0000-1000-8000-0026BB765291",
  description = "Lock Management Auto Security Timeout",
  unit = io.github.dfrommi.rehaktor.core.ValueUnit.SECONDS,
  format = io.github.dfrommi.rehaktor.core.Format.UINT32, values = values, setter = setter,
  isObservable = true
) {
  public constructor(value: Int) : this(Flux.just(value), {})
}
