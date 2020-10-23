// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.ByteArray

public open class SupportedAudioStreamConfigurationCharacteristic(
  value: ByteArray
) : TlvReactiveCharacteristic(
  type = "00000115-0000-1000-8000-0026BB765291",
  description = "Supported Audio Stream Configuration", values = Flux.just(value), isObservable = false
)
