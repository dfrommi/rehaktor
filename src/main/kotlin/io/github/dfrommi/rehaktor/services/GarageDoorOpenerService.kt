// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CurrentDoorStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockCurrentStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockTargetStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ObstructionDetectedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetDoorStateCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class GarageDoorOpenerService(
  currentDoorState: CurrentDoorStateCharacteristic,
  targetDoorState: TargetDoorStateCharacteristic,
  obstructionDetected: ObstructionDetectedCharacteristic,
  lockCurrentState: LockCurrentStateCharacteristic? = null,
  lockTargetState: LockTargetStateCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000041-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentDoorState,
      targetDoorState,
      obstructionDetected,
      lockCurrentState,
      lockTargetState,
      name
    ),
    linkedServices = linkedServices
  )
