// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class TemperatureSensorService(
  currentTemperature: CurrentTemperatureCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "0000008A-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentTemperature,
      statusActive,
      statusFault,
      statusLowBattery,
      statusTampered,
      name
    ),
    linkedServices = linkedServices
  )
