// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class IrrigationSystemService(
  active: ActiveCharacteristic,
  programMode: ProgramModeCharacteristic,
  inUse: InUseCharacteristic,
  name: NameCharacteristic? = null,
  remainingDuration: RemainingDurationCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000CF-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      programMode,
      inUse,
      name,
      remainingDuration,
      statusFault
    ),
    linkedServices = linkedServices
  )
