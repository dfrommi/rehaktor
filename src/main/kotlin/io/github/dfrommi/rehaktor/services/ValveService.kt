// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class ValveService(
  active: ActiveCharacteristic,
  inUse: InUseCharacteristic,
  valveType: ValveTypeCharacteristic,
  setDuration: SetDurationCharacteristic? = null,
  remainingDuration: RemainingDurationCharacteristic? = null,
  isConfigured: IsConfiguredCharacteristic? = null,
  serviceLabelIndex: ServiceLabelIndexCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000D0-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      inUse,
      valveType,
      setDuration,
      remainingDuration,
      isConfigured,
      serviceLabelIndex,
      statusFault,
      name
    ),
    linkedServices = linkedServices
  )
