// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import kotlin.Any
import kotlin.ByteArray

public open class LockControlPointCharacteristic(
  setter: (ByteArray) -> Any?
) : TlvReactiveCharacteristic(
  type = "00000019-0000-1000-8000-0026BB765291",
  description = "Lock Control Point", setter = setter, isObservable = false
)
