// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class OccupancySensorService(
  occupancyDetected: OccupancyDetectedCharacteristic,
  name: NameCharacteristic? = null,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000086-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      occupancyDetected,
      name,
      statusActive,
      statusFault,
      statusTampered,
      statusLowBattery
    ),
    linkedServices = linkedServices
  )
