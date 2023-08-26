// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.BatteryLevel
import io.github.dfrommi.hapkt.characteristics.ChargingState
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.StatusLowBattery
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class BatteryService(
  public val batteryLevel: BatteryLevel,
  public val chargingState: ChargingState,
  public val statusLowBattery: StatusLowBattery,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000096-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    batteryLevel,
    chargingState,
    statusLowBattery,
    name
  )

}
