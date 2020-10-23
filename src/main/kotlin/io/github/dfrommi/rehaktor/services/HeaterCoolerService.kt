// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CoolingThresholdTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentHeaterCoolerStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.HeatingThresholdTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockPhysicalControlsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationSpeedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SwingModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetHeaterCoolerStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TemperatureDisplayUnitsCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class HeaterCoolerService(
  active: ActiveCharacteristic,
  currentHeaterCoolerState: CurrentHeaterCoolerStateCharacteristic,
  targetHeaterCoolerState: TargetHeaterCoolerStateCharacteristic,
  currentTemperature: CurrentTemperatureCharacteristic,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  coolingThresholdTemperature: CoolingThresholdTemperatureCharacteristic? = null,
  heatingThresholdTemperature: HeatingThresholdTemperatureCharacteristic? = null,
  temperatureDisplayUnits: TemperatureDisplayUnitsCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "000000BC-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
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
    ),
    linkedServices = linkedServices
  )
