// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.SecuritySystemAlarmType
import io.github.dfrommi.hapkt.characteristics.SecuritySystemCurrentState
import io.github.dfrommi.hapkt.characteristics.SecuritySystemTargetState
import io.github.dfrommi.hapkt.characteristics.StatusFault
import io.github.dfrommi.hapkt.characteristics.StatusTampered
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class SecuritySystem(
  public val securitySystemCurrentState: SecuritySystemCurrentState,
  public val securitySystemTargetState: SecuritySystemTargetState,
  public val statusFault: StatusFault? = null,
  public val statusTampered: StatusTampered? = null,
  public val securitySystemAlarmType: SecuritySystemAlarmType? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "0000007E-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    securitySystemCurrentState,
    securitySystemTargetState,
    statusFault,
    statusTampered,
    securitySystemAlarmType,
    name
  )

}
