// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.AdministratorOnlyAccessCharacteristic
import io.github.dfrommi.rehaktor.characteristics.AudioFeedbackCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentDoorStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockControlPointCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockLastKnownActionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockManagementAutoSecurityTimeoutCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LogsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.MotionDetectedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.VersionCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class LockManagementService(
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
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
