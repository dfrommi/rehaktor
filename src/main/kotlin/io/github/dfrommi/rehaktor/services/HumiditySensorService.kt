// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class HumiditySensorService(
  currentRelativeHumidity: CurrentRelativeHumidityCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000082-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentRelativeHumidity,
      statusActive,
      statusFault,
      statusTampered,
      statusLowBattery,
      name
    ),
    linkedServices = linkedServices
  )
