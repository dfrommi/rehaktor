// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Any
import kotlin.Boolean

public open class LockPhysicalControlsCharacteristic(
  values: Flux<Enum>,
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<LockPhysicalControlsCharacteristic.Enum>(
    type = "000000A7-0000-1000-8000-0026BB765291",
    description = "Lock Physical Controls", enumClass = Enum::class, values = values, setter = setter,
    isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value), {})

  public enum class Enum {
    CONTROL_LOCK_DISABLED,
    CONTROL_LOCK_ENABLED,
    ;

    public fun toBoolean() = this == CONTROL_LOCK_ENABLED

    public companion object {
      public fun from(v: Boolean) = if (v) CONTROL_LOCK_ENABLED else CONTROL_LOCK_DISABLED
    }
  }
}
