// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.OnCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationDirectionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationSpeedCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class FanService(
  on: OnCharacteristic,
  rotationDirection: RotationDirectionCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000040-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      on,
      rotationDirection,
      rotationSpeed,
      name
    ),
    linkedServices = linkedServices
  )
