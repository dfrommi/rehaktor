// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.OnCharacteristic
import io.github.dfrommi.rehaktor.characteristics.OutletInUseCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class OutletService(
  on: OnCharacteristic,
  outletInUse: OutletInUseCharacteristic,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000047-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      on,
      outletInUse,
      name
    ),
    linkedServices = linkedServices
  )
