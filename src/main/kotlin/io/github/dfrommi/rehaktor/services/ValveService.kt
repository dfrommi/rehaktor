// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.InUseCharacteristic
import io.github.dfrommi.rehaktor.characteristics.IsConfiguredCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RemainingDurationCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ServiceLabelIndexCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SetDurationCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ValveTypeCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class ValveService(
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
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
