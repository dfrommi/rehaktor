// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ProgrammableSwitchEventCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ServiceLabelIndexCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class StatelessProgrammableSwitchService(
  programmableSwitchEvent: ProgrammableSwitchEventCharacteristic,
  name: NameCharacteristic? = null,
  serviceLabelIndex: ServiceLabelIndexCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "00000089-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      programmableSwitchEvent,
      name,
      serviceLabelIndex
    ),
    linkedServices = linkedServices
  )
