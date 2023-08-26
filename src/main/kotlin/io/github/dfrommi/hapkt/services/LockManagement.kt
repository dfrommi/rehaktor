// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.AdministratorOnlyAccess
import io.github.dfrommi.hapkt.characteristics.AudioFeedback
import io.github.dfrommi.hapkt.characteristics.CurrentDoorState
import io.github.dfrommi.hapkt.characteristics.LockControlPoint
import io.github.dfrommi.hapkt.characteristics.LockLastKnownAction
import io.github.dfrommi.hapkt.characteristics.LockManagementAutoSecurityTimeout
import io.github.dfrommi.hapkt.characteristics.Logs
import io.github.dfrommi.hapkt.characteristics.MotionDetected
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.Version
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class LockManagement(
  public val lockControlPoint: LockControlPoint,
  public val version: Version,
  public val logs: Logs? = null,
  public val audioFeedback: AudioFeedback? = null,
  public val lockManagementAutoSecurityTimeout: LockManagementAutoSecurityTimeout? = null,
  public val administratorOnlyAccess: AdministratorOnlyAccess? = null,
  public val lockLastKnownAction: LockLastKnownAction? = null,
  public val currentDoorState: CurrentDoorState? = null,
  public val motionDetected: MotionDetected? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000044-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
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
  )

}
