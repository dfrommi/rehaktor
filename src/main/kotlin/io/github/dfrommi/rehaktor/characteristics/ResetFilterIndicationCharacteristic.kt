// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.IntegerReactiveCharacteristic
import kotlin.Any
import kotlin.Int

public open class ResetFilterIndicationCharacteristic(
  setter: (Int) -> Any?
) : IntegerReactiveCharacteristic(
  type = "000000AD-0000-1000-8000-0026BB765291",
  description = "Reset Filter Indication", minValue = 1, maxValue = 1, minStep = 1,
  format = io.github.dfrommi.rehaktor.core.Format.UINT8, setter = setter, isObservable = false
)
