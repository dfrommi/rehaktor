// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.BatteryLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ChargingStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusLowBatteryCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class BatteryServiceService(
  batteryLevel: BatteryLevelCharacteristic,
  chargingState: ChargingStateCharacteristic,
  statusLowBattery: StatusLowBatteryCharacteristic,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000096-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      batteryLevel,
      chargingState,
      statusLowBattery,
      name
    ),
    linkedServices = linkedServices
  )
