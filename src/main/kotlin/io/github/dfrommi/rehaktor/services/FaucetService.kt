// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class FaucetService(
  active: ActiveCharacteristic,
  name: NameCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000D7-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      name,
      statusFault
    ),
    linkedServices = linkedServices
  )
