// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.CarbonMonoxideDetected
import io.github.dfrommi.hapkt.characteristics.CarbonMonoxideLevel
import io.github.dfrommi.hapkt.characteristics.CarbonMonoxidePeakLevel
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.StatusActive
import io.github.dfrommi.hapkt.characteristics.StatusFault
import io.github.dfrommi.hapkt.characteristics.StatusLowBattery
import io.github.dfrommi.hapkt.characteristics.StatusTampered
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class CarbonMonoxideSensor(
  public val carbonMonoxideDetected: CarbonMonoxideDetected,
  public val statusActive: StatusActive? = null,
  public val statusFault: StatusFault? = null,
  public val statusLowBattery: StatusLowBattery? = null,
  public val statusTampered: StatusTampered? = null,
  public val carbonMonoxideLevel: CarbonMonoxideLevel? = null,
  public val carbonMonoxidePeakLevel: CarbonMonoxidePeakLevel? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "0000007F-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    carbonMonoxideDetected,
    statusActive,
    statusFault,
    statusLowBattery,
    statusTampered,
    carbonMonoxideLevel,
    carbonMonoxidePeakLevel,
    name
  )

}
