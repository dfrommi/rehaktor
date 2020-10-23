// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentFanStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockPhysicalControlsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationDirectionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationSpeedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SwingModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetFanStateCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class FanV2Service(
  active: ActiveCharacteristic,
  currentFanState: CurrentFanStateCharacteristic? = null,
  targetFanState: TargetFanStateCharacteristic? = null,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  rotationDirection: RotationDirectionCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "000000B7-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      currentFanState,
      targetFanState,
      lockPhysicalControls,
      name,
      rotationDirection,
      rotationSpeed,
      swingMode
    ),
    linkedServices = linkedServices
  )
