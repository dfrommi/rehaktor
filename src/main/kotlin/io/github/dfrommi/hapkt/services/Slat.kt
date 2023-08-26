// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.CurrentSlatState
import io.github.dfrommi.hapkt.characteristics.CurrentTiltAngle
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.SlatType
import io.github.dfrommi.hapkt.characteristics.SwingMode
import io.github.dfrommi.hapkt.characteristics.TargetTiltAngle
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class Slat(
  public val slatType: SlatType,
  public val currentSlatState: CurrentSlatState,
  public val name: Name? = null,
  public val currentTiltAngle: CurrentTiltAngle? = null,
  public val targetTiltAngle: TargetTiltAngle? = null,
  public val swingMode: SwingMode? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000B9-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    slatType,
    currentSlatState,
    name,
    currentTiltAngle,
    targetTiltAngle,
    swingMode
  )

}
