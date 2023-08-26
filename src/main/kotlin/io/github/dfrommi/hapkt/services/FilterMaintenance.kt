// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.FilterChangeIndication
import io.github.dfrommi.hapkt.characteristics.FilterLifeLevel
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.ResetFilterIndication
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class FilterMaintenance(
  public val filterChangeIndication: FilterChangeIndication,
  public val filterLifeLevel: FilterLifeLevel? = null,
  public val resetFilterIndication: ResetFilterIndication? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000BA-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    filterChangeIndication,
    filterLifeLevel,
    resetFilterIndication,
    name
  )

}
