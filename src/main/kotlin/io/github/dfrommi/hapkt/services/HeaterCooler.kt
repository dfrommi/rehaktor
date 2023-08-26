// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.CoolingThresholdTemperature
import io.github.dfrommi.hapkt.characteristics.CurrentHeaterCoolerState
import io.github.dfrommi.hapkt.characteristics.CurrentTemperature
import io.github.dfrommi.hapkt.characteristics.HeatingThresholdTemperature
import io.github.dfrommi.hapkt.characteristics.LockPhysicalControls
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.RotationSpeed
import io.github.dfrommi.hapkt.characteristics.SwingMode
import io.github.dfrommi.hapkt.characteristics.TargetHeaterCoolerState
import io.github.dfrommi.hapkt.characteristics.TemperatureDisplayUnits
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class HeaterCooler(
  public val active: Active,
  public val currentHeaterCoolerState: CurrentHeaterCoolerState,
  public val targetHeaterCoolerState: TargetHeaterCoolerState,
  public val currentTemperature: CurrentTemperature,
  public val lockPhysicalControls: LockPhysicalControls? = null,
  public val name: Name? = null,
  public val swingMode: SwingMode? = null,
  public val coolingThresholdTemperature: CoolingThresholdTemperature? = null,
  public val heatingThresholdTemperature: HeatingThresholdTemperature? = null,
  public val temperatureDisplayUnits: TemperatureDisplayUnits? = null,
  public val rotationSpeed: RotationSpeed? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000BC-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    active,
    currentHeaterCoolerState,
    targetHeaterCoolerState,
    currentTemperature,
    lockPhysicalControls,
    name,
    swingMode,
    coolingThresholdTemperature,
    heatingThresholdTemperature,
    temperatureDisplayUnits,
    rotationSpeed
  )

}
