// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CurrentPositionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.HoldPositionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ObstructionDetectedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.PositionStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetPositionCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class WindowService(
  currentPosition: CurrentPositionCharacteristic,
  targetPosition: TargetPositionCharacteristic,
  positionState: PositionStateCharacteristic,
  holdPosition: HoldPositionCharacteristic? = null,
  obstructionDetected: ObstructionDetectedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
