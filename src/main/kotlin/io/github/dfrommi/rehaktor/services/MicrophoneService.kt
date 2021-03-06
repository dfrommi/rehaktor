// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.MuteCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.VolumeCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class MicrophoneService(
  volume: VolumeCharacteristic,
  mute: MuteCharacteristic,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000112-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      volume,
      mute,
      name
    ),
    linkedServices = linkedServices
  )
