// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.CurrentRelativeHumidityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusLowBatteryCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusTamperedCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class HumiditySensorService(
  currentRelativeHumidity: CurrentRelativeHumidityCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
