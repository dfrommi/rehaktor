// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.characteristics

import io.github.dfrommi.rehaktor.core.*
import reactor.core.publisher.Flux

class AudioFeedbackCharacteristic(values: Flux<Boolean>, setter: (Boolean) -> Any?) : BooleanReactiveCharacteristic(
  type = "00000005-0000-1000-8000-0026BB765291",
  description = "Audio Feedback",
  values = values,
  setter = setter,
  isObservable = true
)
