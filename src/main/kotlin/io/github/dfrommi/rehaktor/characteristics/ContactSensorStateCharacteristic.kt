// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class ContactSensorStateCharacteristic(values: Flux<ContactSensorStateCharacteristic.Enum>) : EnumReactiveCharacteristic<ContactSensorStateCharacteristic.Enum>(
  type = "0000006A-0000-1000-8000-0026BB765291",
  description = "Contact Sensor State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    CONTACT_DETECTED,
    CONTACT_NOT_DETECTED;fun toBoolean() = this == CONTACT_NOT_DETECTED

    companion object {
      fun from(v: Boolean) = if (v) CONTACT_NOT_DETECTED else CONTACT_DETECTED
    } 
  } 
}
