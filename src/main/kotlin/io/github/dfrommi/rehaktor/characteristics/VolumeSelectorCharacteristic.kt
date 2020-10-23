// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import kotlin.Any
import kotlin.Boolean

public open class VolumeSelectorCharacteristic(
  setter: (Enum) -> Any?
) :
  EnumReactiveCharacteristic<VolumeSelectorCharacteristic.Enum>(
    type = "000000EA-0000-1000-8000-0026BB765291",
    description = "Volume Selector", enumClass = Enum::class, setter = setter, isObservable = false
  ) {
  public enum class Enum {
    INCREMENT,
    DECREMENT,
    ;

    public fun toBoolean() = this == DECREMENT

    public companion object {
      public fun from(v: Boolean) = if (v) DECREMENT else INCREMENT
    }
  }
}
