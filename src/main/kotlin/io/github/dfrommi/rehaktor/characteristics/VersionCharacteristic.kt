// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.StringReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.String

public open class VersionCharacteristic(
  values: Flux<String>
) : StringReactiveCharacteristic(
  type = "00000037-0000-1000-8000-0026BB765291", description = "Version",
  values = values, isObservable = true
) {
  public constructor(value: String) : this(Flux.just(value))
}
