// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class FanV2Service(
  active: ActiveCharacteristic,
  currentFanState: CurrentFanStateCharacteristic? = null,
  targetFanState: TargetFanStateCharacteristic? = null,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  rotationDirection: RotationDirectionCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
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
