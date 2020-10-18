// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class HeaterCoolerService(
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
) : Service by HomekitService(
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
