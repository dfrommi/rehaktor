// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.TlvReactiveCharacteristic
import reactor.core.publisher.Flux
import kotlin.ByteArray

public open class SupportedRTPConfigurationCharacteristic(
  value: ByteArray
) : TlvReactiveCharacteristic(
  type = "00000116-0000-1000-8000-0026BB765291",
  description = "Supported RTP Configuration", values = Flux.just(value), isObservable = false
)
