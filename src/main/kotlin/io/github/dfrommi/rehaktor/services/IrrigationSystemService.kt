// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.InUseCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ProgramModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RemainingDurationCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class IrrigationSystemService(
  active: ActiveCharacteristic,
  programMode: ProgramModeCharacteristic,
  inUse: InUseCharacteristic,
  name: NameCharacteristic? = null,
  remainingDuration: RemainingDurationCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
