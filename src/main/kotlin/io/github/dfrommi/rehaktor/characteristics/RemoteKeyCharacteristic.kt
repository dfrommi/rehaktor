// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*

class RemoteKeyCharacteristic(setter: (RemoteKeyCharacteristic.Enum) -> Any?) : EnumReactiveCharacteristic<RemoteKeyCharacteristic.Enum>(
  type = "000000E1-0000-1000-8000-0026BB765291",
  description = "Remote Key",
  enumClass = Enum::class,
  setter = setter,
  isObservable = false
) {
  enum class Enum {
    REWIND,
    FASTFORWARD,
    NEXTTRACK,
    PREVTRACK,
    ARROWUP,
    ARROWDOWN,
    ARROWLEFT,
    ARROWRIGHT,
    SELECT,
    BACK,
    EXIT,
    PLAYPAUSE,
    UNKNOWN_1,
    UNKNOWN_2,
    UNKNOWN_3,
    INFO,
    UNKNOWN_4;
  } 
}
