// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class LockManagementService(
  lockControlPoint: LockControlPointCharacteristic,
  version: VersionCharacteristic,
  logs: LogsCharacteristic? = null,
  audioFeedback: AudioFeedbackCharacteristic? = null,
  lockManagementAutoSecurityTimeout: LockManagementAutoSecurityTimeoutCharacteristic? = null,
  administratorOnlyAccess: AdministratorOnlyAccessCharacteristic? = null,
  lockLastKnownAction: LockLastKnownActionCharacteristic? = null,
  currentDoorState: CurrentDoorStateCharacteristic? = null,
  motionDetected: MotionDetectedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000044-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      lockControlPoint,
      version,
      logs,
      audioFeedback,
      lockManagementAutoSecurityTimeout,
      administratorOnlyAccess,
      lockLastKnownAction,
      currentDoorState,
      motionDetected,
      name
    ),
    linkedServices = linkedServices
  )
