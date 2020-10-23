// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CarbonDioxideDetectedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CarbonDioxideLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CarbonDioxidePeakLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusLowBatteryCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusTamperedCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class CarbonDioxideSensorService(
  carbonDioxideDetected: CarbonDioxideDetectedCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  carbonDioxideLevel: CarbonDioxideLevelCharacteristic? = null,
  carbonDioxidePeakLevel: CarbonDioxidePeakLevelCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
