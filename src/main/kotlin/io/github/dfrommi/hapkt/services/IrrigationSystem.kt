// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.InUse
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.ProgramMode
import io.github.dfrommi.hapkt.characteristics.RemainingDuration
import io.github.dfrommi.hapkt.characteristics.StatusFault
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class IrrigationSystem(
  public val active: Active,
  public val programMode: ProgramMode,
  public val inUse: InUse,
  public val name: Name? = null,
  public val remainingDuration: RemainingDuration? = null,
  public val statusFault: StatusFault? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000CF-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    active,
    programMode,
    inUse,
    name,
    remainingDuration,
    statusFault
  )

}
