// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class SmartSpeakerService(
  currentMediaState: CurrentMediaStateCharacteristic,
  targetMediaState: TargetMediaStateCharacteristic,
  configuredName: ConfiguredNameCharacteristic? = null,
  volume: VolumeCharacteristic? = null,
  mute: MuteCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000228-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentMediaState,
      targetMediaState,
      configuredName,
      volume,
      mute,
      name
    ),
    linkedServices = linkedServices
  )
