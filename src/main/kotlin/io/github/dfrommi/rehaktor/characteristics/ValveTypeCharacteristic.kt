// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux

public open class ValveTypeCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<ValveTypeCharacteristic.Enum>(
    type = "000000D5-0000-1000-8000-0026BB765291",
    description = "Valve Type", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    GENERIC_VALVE,
    IRRIGATION,
    SHOWER_HEAD,
    WATER_FAUCET,
  }
}
