// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentAirPurifierStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockPhysicalControlsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationSpeedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SwingModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetAirPurifierStateCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class AirPurifierService(
  active: ActiveCharacteristic,
  currentAirPurifierState: CurrentAirPurifierStateCharacteristic,
  targetAirPurifierState: TargetAirPurifierStateCharacteristic,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "000000BB-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      currentAirPurifierState,
      targetAirPurifierState,
      lockPhysicalControls,
      name,
      swingMode,
      rotationSpeed
    ),
    linkedServices = linkedServices
  )
