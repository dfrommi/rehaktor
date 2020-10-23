// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.EnumReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.Boolean

public open class ContactSensorStateCharacteristic(
  values: Flux<Enum>
) :
  EnumReactiveCharacteristic<ContactSensorStateCharacteristic.Enum>(
    type = "0000006A-0000-1000-8000-0026BB765291",
    description = "Contact Sensor State", enumClass = Enum::class, values = values, isObservable = true
  ) {
  public constructor(value: Enum) : this(Flux.just(value))

  public enum class Enum {
    CONTACT_DETECTED,
    CONTACT_NOT_DETECTED,
    ;

    public fun toBoolean() = this == CONTACT_NOT_DETECTED

    public companion object {
      public fun from(v: Boolean) = if (v) CONTACT_NOT_DETECTED else CONTACT_DETECTED
    }
  }
}
