// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class TelevisionSpeakerService(
  mute: MuteCharacteristic,
  active: ActiveCharacteristic? = null,
  volume: VolumeCharacteristic? = null,
  volumeControlType: VolumeControlTypeCharacteristic? = null,
  volumeSelector: VolumeSelectorCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000113-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      mute,
      active,
      volume,
      volumeControlType,
      volumeSelector,
      name
    ),
    linkedServices = linkedServices
  )
