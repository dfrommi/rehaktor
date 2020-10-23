// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CarbonMonoxideDetectedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CarbonMonoxideLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CarbonMonoxidePeakLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusLowBatteryCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusTamperedCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class CarbonMonoxideSensorService(
  carbonMonoxideDetected: CarbonMonoxideDetectedCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  carbonMonoxideLevel: CarbonMonoxideLevelCharacteristic? = null,
  carbonMonoxidePeakLevel: CarbonMonoxidePeakLevelCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
