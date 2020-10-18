// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class SlatService(
  slatType: SlatTypeCharacteristic,
  currentSlatState: CurrentSlatStateCharacteristic,
  name: NameCharacteristic? = null,
  currentTiltAngle: CurrentTiltAngleCharacteristic? = null,
  targetTiltAngle: TargetTiltAngleCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000B9-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      slatType,
      currentSlatState,
      name,
      currentTiltAngle,
      targetTiltAngle,
      swingMode
    ),
    linkedServices = linkedServices
  )
