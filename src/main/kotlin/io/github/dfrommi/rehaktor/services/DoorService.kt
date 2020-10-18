// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class DoorService(
  currentPosition: CurrentPositionCharacteristic,
  positionState: PositionStateCharacteristic,
  targetPosition: TargetPositionCharacteristic,
  holdPosition: HoldPositionCharacteristic? = null,
  obstructionDetected: ObstructionDetectedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000081-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentPosition,
      positionState,
      targetPosition,
      holdPosition,
      obstructionDetected,
      name
    ),
    linkedServices = linkedServices
  )
