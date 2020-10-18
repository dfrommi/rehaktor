// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class ThermostatService(
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
) : Service by HomekitService(
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
