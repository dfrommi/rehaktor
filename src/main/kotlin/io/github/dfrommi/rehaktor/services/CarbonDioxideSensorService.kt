// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class CarbonDioxideSensorService(
  carbonDioxideDetected: CarbonDioxideDetectedCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  carbonDioxideLevel: CarbonDioxideLevelCharacteristic? = null,
  carbonDioxidePeakLevel: CarbonDioxidePeakLevelCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000097-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      carbonDioxideDetected,
      statusActive,
      statusFault,
      statusLowBattery,
      statusTampered,
      carbonDioxideLevel,
      carbonDioxidePeakLevel,
      name
    ),
    linkedServices = linkedServices
  )
