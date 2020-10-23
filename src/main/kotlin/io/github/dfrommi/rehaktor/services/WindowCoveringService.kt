// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CurrentHorizontalTiltAngleCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentPositionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentVerticalTiltAngleCharacteristic
import io.github.dfrommi.rehaktor.characteristics.HoldPositionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ObstructionDetectedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.PositionStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetHorizontalTiltAngleCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetPositionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetVerticalTiltAngleCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class WindowCoveringService(
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
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
