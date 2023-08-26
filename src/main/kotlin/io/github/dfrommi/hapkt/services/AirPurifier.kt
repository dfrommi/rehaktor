// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.CurrentAirPurifierState
import io.github.dfrommi.hapkt.characteristics.LockPhysicalControls
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.RotationSpeed
import io.github.dfrommi.hapkt.characteristics.SwingMode
import io.github.dfrommi.hapkt.characteristics.TargetAirPurifierState
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class AirPurifier(
  public val active: Active,
  public val currentAirPurifierState: CurrentAirPurifierState,
  public val targetAirPurifierState: TargetAirPurifierState,
  public val lockPhysicalControls: LockPhysicalControls? = null,
  public val name: Name? = null,
  public val swingMode: SwingMode? = null,
  public val rotationSpeed: RotationSpeed? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000BB-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    active,
    currentAirPurifierState,
    targetAirPurifierState,
    lockPhysicalControls,
    name,
    swingMode,
    rotationSpeed
  )

}
