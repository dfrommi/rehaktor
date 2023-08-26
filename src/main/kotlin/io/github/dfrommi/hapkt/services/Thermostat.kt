// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.CoolingThresholdTemperature
import io.github.dfrommi.hapkt.characteristics.CurrentHeatingCoolingState
import io.github.dfrommi.hapkt.characteristics.CurrentRelativeHumidity
import io.github.dfrommi.hapkt.characteristics.CurrentTemperature
import io.github.dfrommi.hapkt.characteristics.HeatingThresholdTemperature
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.TargetHeatingCoolingState
import io.github.dfrommi.hapkt.characteristics.TargetRelativeHumidity
import io.github.dfrommi.hapkt.characteristics.TargetTemperature
import io.github.dfrommi.hapkt.characteristics.TemperatureDisplayUnits
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class Thermostat(
  public val currentHeatingCoolingState: CurrentHeatingCoolingState,
  public val targetHeatingCoolingState: TargetHeatingCoolingState,
  public val currentTemperature: CurrentTemperature,
  public val targetTemperature: TargetTemperature,
  public val temperatureDisplayUnits: TemperatureDisplayUnits,
  public val currentRelativeHumidity: CurrentRelativeHumidity? = null,
  public val targetRelativeHumidity: TargetRelativeHumidity? = null,
  public val coolingThresholdTemperature: CoolingThresholdTemperature? = null,
  public val heatingThresholdTemperature: HeatingThresholdTemperature? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "0000004A-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    currentHeatingCoolingState,
    targetHeatingCoolingState,
    currentTemperature,
    targetTemperature,
    temperatureDisplayUnits,
    currentRelativeHumidity,
    targetRelativeHumidity,
    coolingThresholdTemperature,
    heatingThresholdTemperature,
    name
  )

}
