// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.AccessoryFlagsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.FirmwareRevisionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.HardwareRevisionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.IdentifyCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ManufacturerCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ModelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SerialNumberCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class AccessoryInformationService(
  identify: IdentifyCharacteristic,
  manufacturer: ManufacturerCharacteristic,
  model: ModelCharacteristic,
  name: NameCharacteristic,
  serialNumber: SerialNumberCharacteristic,
  firmwareRevision: FirmwareRevisionCharacteristic,
  hardwareRevision: HardwareRevisionCharacteristic? = null,
  accessoryFlags: AccessoryFlagsCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
