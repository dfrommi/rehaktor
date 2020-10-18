// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class WindowService(
  currentPosition: CurrentPositionCharacteristic,
  targetPosition: TargetPositionCharacteristic,
  positionState: PositionStateCharacteristic,
  holdPosition: HoldPositionCharacteristic? = null,
  obstructionDetected: ObstructionDetectedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "0000008B-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentPosition,
      targetPosition,
      positionState,
      holdPosition,
      obstructionDetected,
      name
    ),
    linkedServices = linkedServices
  )
