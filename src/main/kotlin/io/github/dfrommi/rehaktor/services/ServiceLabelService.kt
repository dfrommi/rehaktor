// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ServiceLabelNamespaceCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class ServiceLabelService(
  serviceLabelNamespace: ServiceLabelNamespaceCharacteristic,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "000000CC-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      serviceLabelNamespace,
      name
    ),
    linkedServices = linkedServices
  )
