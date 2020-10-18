// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class AccessoryInformationService(
  identify: IdentifyCharacteristic,
  manufacturer: ManufacturerCharacteristic,
  model: ModelCharacteristic,
  name: NameCharacteristic,
  serialNumber: SerialNumberCharacteristic,
  firmwareRevision: FirmwareRevisionCharacteristic,
  hardwareRevision: HardwareRevisionCharacteristic? = null,
  accessoryFlags: AccessoryFlagsCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "0000003E-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      identify,
      manufacturer,
      model,
      name,
      serialNumber,
      firmwareRevision,
      hardwareRevision,
      accessoryFlags
    ),
    linkedServices = linkedServices
  )
