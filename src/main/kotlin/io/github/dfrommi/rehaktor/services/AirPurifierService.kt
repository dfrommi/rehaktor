// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class AirPurifierService(
  active: ActiveCharacteristic,
  currentAirPurifierState: CurrentAirPurifierStateCharacteristic,
  targetAirPurifierState: TargetAirPurifierStateCharacteristic,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
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
