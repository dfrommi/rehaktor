// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class SecuritySystemCurrentStateCharacteristic(values: Flux<SecuritySystemCurrentStateCharacteristic.Enum>) : EnumReactiveCharacteristic<SecuritySystemCurrentStateCharacteristic.Enum>(
  type = "00000066-0000-1000-8000-0026BB765291",
  description = "Security System Current State",
  enumClass = Enum::class,
  values = values,
  isObservable = true
) {
  enum class Enum {
    STAY_ARM,
    AWAY_ARM,
    NIGHT_ARM,
    DISARMED,
    ALARM_TRIGGERED;
  } 
}
