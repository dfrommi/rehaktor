// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.BrightnessCharacteristic
import io.github.dfrommi.rehaktor.characteristics.HueCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.OnCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SaturationCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class LightbulbService(
  on: OnCharacteristic,
  brightness: BrightnessCharacteristic? = null,
  hue: HueCharacteristic? = null,
  saturation: SaturationCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000043-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      on,
      brightness,
      hue,
      saturation,
      name
    ),
    linkedServices = linkedServices
  )
