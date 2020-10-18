// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class GarageDoorOpenerService(
  currentDoorState: CurrentDoorStateCharacteristic,
  targetDoorState: TargetDoorStateCharacteristic,
  obstructionDetected: ObstructionDetectedCharacteristic,
  lockCurrentState: LockCurrentStateCharacteristic? = null,
  lockTargetState: LockTargetStateCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
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
