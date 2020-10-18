// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class WindowCoveringService(
  currentPosition: CurrentPositionCharacteristic,
  targetPosition: TargetPositionCharacteristic,
  positionState: PositionStateCharacteristic,
  holdPosition: HoldPositionCharacteristic? = null,
  targetHorizontalTiltAngle: TargetHorizontalTiltAngleCharacteristic? = null,
  targetVerticalTiltAngle: TargetVerticalTiltAngleCharacteristic? = null,
  currentHorizontalTiltAngle: CurrentHorizontalTiltAngleCharacteristic? = null,
  currentVerticalTiltAngle: CurrentVerticalTiltAngleCharacteristic? = null,
  obstructionDetected: ObstructionDetectedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "0000008C-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentPosition,
      targetPosition,
      positionState,
      holdPosition,
      targetHorizontalTiltAngle,
      targetVerticalTiltAngle,
      currentHorizontalTiltAngle,
      currentVerticalTiltAngle,
      obstructionDetected,
      name
    ),
    linkedServices = linkedServices
  )
