// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class LockManagementAutoSecurityTimeoutCharacteristic(values: Flux<Int>, setter: (Int) -> Any?) : IntegerReactiveCharacteristic(
  type = "0000001A-0000-1000-8000-0026BB765291",
  description = "Lock Management Auto Security Timeout",
  unit = ValueUnit.SECONDS,
  format = Format.UINT32,
  values = values,
  setter = setter,
  isObservable = true
)
