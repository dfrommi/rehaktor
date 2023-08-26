// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.CurrentDoorState
import io.github.dfrommi.hapkt.characteristics.LockCurrentState
import io.github.dfrommi.hapkt.characteristics.LockTargetState
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.ObstructionDetected
import io.github.dfrommi.hapkt.characteristics.TargetDoorState
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class GarageDoorOpener(
  public val currentDoorState: CurrentDoorState,
  public val targetDoorState: TargetDoorState,
  public val obstructionDetected: ObstructionDetected,
  public val lockCurrentState: LockCurrentState? = null,
  public val lockTargetState: LockTargetState? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000041-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    currentDoorState,
    targetDoorState,
    obstructionDetected,
    lockCurrentState,
    lockTargetState,
    name
  )

}
