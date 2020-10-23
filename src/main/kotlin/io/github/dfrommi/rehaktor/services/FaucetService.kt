// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class FaucetService(
  active: ActiveCharacteristic,
  name: NameCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "000000D7-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      name,
      statusFault
    ),
    linkedServices = linkedServices
  )
