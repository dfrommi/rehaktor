// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CoolingThresholdTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentHeatingCoolingStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentRelativeHumidityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.HeatingThresholdTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetHeatingCoolingStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetRelativeHumidityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetTemperatureCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TemperatureDisplayUnitsCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class ThermostatService(
  currentHeatingCoolingState: CurrentHeatingCoolingStateCharacteristic,
  targetHeatingCoolingState: TargetHeatingCoolingStateCharacteristic,
  currentTemperature: CurrentTemperatureCharacteristic,
  targetTemperature: TargetTemperatureCharacteristic,
  temperatureDisplayUnits: TemperatureDisplayUnitsCharacteristic,
  currentRelativeHumidity: CurrentRelativeHumidityCharacteristic? = null,
  targetRelativeHumidity: TargetRelativeHumidityCharacteristic? = null,
  coolingThresholdTemperature: CoolingThresholdTemperatureCharacteristic? = null,
  heatingThresholdTemperature: HeatingThresholdTemperatureCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "0000004A-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
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
    ),
    linkedServices = linkedServices
  )
