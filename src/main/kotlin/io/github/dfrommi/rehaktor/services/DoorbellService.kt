// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.BrightnessCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ProgrammableSwitchEventCharacteristic
import io.github.dfrommi.rehaktor.characteristics.VolumeCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class DoorbellService(
  programmableSwitchEvent: ProgrammableSwitchEventCharacteristic,
  brightness: BrightnessCharacteristic? = null,
  volume: VolumeCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000121-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      programmableSwitchEvent,
      brightness,
      volume,
      name
    ),
    linkedServices = linkedServices
  )
