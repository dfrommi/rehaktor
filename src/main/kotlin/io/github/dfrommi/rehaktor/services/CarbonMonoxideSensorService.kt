// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class CarbonMonoxideSensorService(
  carbonMonoxideDetected: CarbonMonoxideDetectedCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  carbonMonoxideLevel: CarbonMonoxideLevelCharacteristic? = null,
  carbonMonoxidePeakLevel: CarbonMonoxidePeakLevelCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "0000007F-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      carbonMonoxideDetected,
      statusActive,
      statusFault,
      statusLowBattery,
      statusTampered,
      carbonMonoxideLevel,
      carbonMonoxidePeakLevel,
      name
    ),
    linkedServices = linkedServices
  )
