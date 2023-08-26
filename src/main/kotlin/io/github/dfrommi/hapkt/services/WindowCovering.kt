// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.CurrentHorizontalTiltAngle
import io.github.dfrommi.hapkt.characteristics.CurrentPosition
import io.github.dfrommi.hapkt.characteristics.CurrentVerticalTiltAngle
import io.github.dfrommi.hapkt.characteristics.HoldPosition
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.ObstructionDetected
import io.github.dfrommi.hapkt.characteristics.PositionState
import io.github.dfrommi.hapkt.characteristics.TargetHorizontalTiltAngle
import io.github.dfrommi.hapkt.characteristics.TargetPosition
import io.github.dfrommi.hapkt.characteristics.TargetVerticalTiltAngle
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class WindowCovering(
  public val currentPosition: CurrentPosition,
  public val targetPosition: TargetPosition,
  public val positionState: PositionState,
  public val holdPosition: HoldPosition? = null,
  public val targetHorizontalTiltAngle: TargetHorizontalTiltAngle? = null,
  public val targetVerticalTiltAngle: TargetVerticalTiltAngle? = null,
  public val currentHorizontalTiltAngle: CurrentHorizontalTiltAngle? = null,
  public val currentVerticalTiltAngle: CurrentVerticalTiltAngle? = null,
  public val obstructionDetected: ObstructionDetected? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "0000008C-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
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
  )

}
