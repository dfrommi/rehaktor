// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class LockLastKnownActionCharacteristic(values: Flux<LockLastKnownActionCharacteristic.Enum>) : EnumReactiveCharacteristic<LockLastKnownActionCharacteristic.Enum>(
  type = "0000001C-0000-1000-8000-0026BB765291",
  description = "Lock Last Known Action",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    SECURED_PHYSICALLY_INTERIOR,
    UNSECURED_PHYSICALLY_INTERIOR,
    SECURED_PHYSICALLY_EXTERIOR,
    UNSECURED_PHYSICALLY_EXTERIOR,
    SECURED_BY_KEYPAD,
    UNSECURED_BY_KEYPAD,
    SECURED_REMOTELY,
    UNSECURED_REMOTELY,
    SECURED_BY_AUTO_SECURE_TIMEOUT;
  } 
}
