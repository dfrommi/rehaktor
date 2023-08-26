// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.InUse
import io.github.dfrommi.hapkt.characteristics.IsConfigured
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.RemainingDuration
import io.github.dfrommi.hapkt.characteristics.ServiceLabelIndex
import io.github.dfrommi.hapkt.characteristics.SetDuration
import io.github.dfrommi.hapkt.characteristics.StatusFault
import io.github.dfrommi.hapkt.characteristics.ValveType
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class Valve(
  public val active: Active,
  public val inUse: InUse,
  public val valveType: ValveType,
  public val setDuration: SetDuration? = null,
  public val remainingDuration: RemainingDuration? = null,
  public val isConfigured: IsConfigured? = null,
  public val serviceLabelIndex: ServiceLabelIndex? = null,
  public val statusFault: StatusFault? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000D0-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    active,
    inUse,
    valveType,
    setDuration,
    remainingDuration,
    isConfigured,
    serviceLabelIndex,
    statusFault,
    name
  )

}
