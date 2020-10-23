// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.MuteCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.VolumeCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class SpeakerService(
  mute: MuteCharacteristic,
  name: NameCharacteristic? = null,
  volume: VolumeCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000113-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      mute,
      name,
      volume
    ),
    linkedServices = linkedServices
  )
