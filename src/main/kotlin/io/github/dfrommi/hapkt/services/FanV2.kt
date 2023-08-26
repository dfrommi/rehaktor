// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.CurrentFanState
import io.github.dfrommi.hapkt.characteristics.LockPhysicalControls
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.RotationDirection
import io.github.dfrommi.hapkt.characteristics.RotationSpeed
import io.github.dfrommi.hapkt.characteristics.SwingMode
import io.github.dfrommi.hapkt.characteristics.TargetFanState
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class FanV2(
  public val active: Active,
  public val currentFanState: CurrentFanState? = null,
  public val targetFanState: TargetFanState? = null,
  public val lockPhysicalControls: LockPhysicalControls? = null,
  public val name: Name? = null,
  public val rotationDirection: RotationDirection? = null,
  public val rotationSpeed: RotationSpeed? = null,
  public val swingMode: SwingMode? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000B7-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    active,
    currentFanState,
    targetFanState,
    lockPhysicalControls,
    name,
    rotationDirection,
    rotationSpeed,
    swingMode
  )

}
