// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import kotlin.Any
import kotlin.Boolean

public open class PowerModeSelectionCharacteristic(
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<PowerModeSelectionCharacteristic.Enum>(
    type = "000000DF-0000-1000-8000-0026BB765291",
    description = "Power Mode Selection", enumClass = Enum::class, setter = setter, isObservable = false
  ) {
  public enum class Enum {
    SHOW,
    HIDE,
    ;

    public fun toBoolean() = this == HIDE

    public companion object {
      public fun from(v: Boolean) = if (v) HIDE else SHOW
    }
  }
}
