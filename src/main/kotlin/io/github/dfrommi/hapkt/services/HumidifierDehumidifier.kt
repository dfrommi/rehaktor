// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.CurrentHumidifierDehumidifierState
import io.github.dfrommi.hapkt.characteristics.CurrentRelativeHumidity
import io.github.dfrommi.hapkt.characteristics.LockPhysicalControls
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.RelativeHumidityDehumidifierThreshold
import io.github.dfrommi.hapkt.characteristics.RelativeHumidityHumidifierThreshold
import io.github.dfrommi.hapkt.characteristics.RotationSpeed
import io.github.dfrommi.hapkt.characteristics.SwingMode
import io.github.dfrommi.hapkt.characteristics.TargetHumidifierDehumidifierState
import io.github.dfrommi.hapkt.characteristics.WaterLevel
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class HumidifierDehumidifier(
  public val currentRelativeHumidity: CurrentRelativeHumidity,
  public val currentHumidifierDehumidifierState: CurrentHumidifierDehumidifierState,
  public val targetHumidifierDehumidifierState: TargetHumidifierDehumidifierState,
  public val active: Active,
  public val lockPhysicalControls: LockPhysicalControls? = null,
  public val name: Name? = null,
  public val swingMode: SwingMode? = null,
  public val waterLevel: WaterLevel? = null,
  public val relativeHumidityDehumidifierThreshold: RelativeHumidityDehumidifierThreshold? = null,
  public val relativeHumidityHumidifierThreshold: RelativeHumidityHumidifierThreshold? = null,
  public val rotationSpeed: RotationSpeed? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000BD-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    currentRelativeHumidity,
    currentHumidifierDehumidifierState,
    targetHumidifierDehumidifierState,
    active,
    lockPhysicalControls,
    name,
    swingMode,
    waterLevel,
    relativeHumidityDehumidifierThreshold,
    relativeHumidityHumidifierThreshold,
    rotationSpeed
  )

}
