// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.ProgrammableSwitchEvent
import io.github.dfrommi.hapkt.characteristics.ServiceLabelIndex
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class StatelessProgrammableSwitch(
  public val programmableSwitchEvent: ProgrammableSwitchEvent,
  public val name: Name? = null,
  public val serviceLabelIndex: ServiceLabelIndex? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000089-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    programmableSwitchEvent,
    name,
    serviceLabelIndex
  )

}
