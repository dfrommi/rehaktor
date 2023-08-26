// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.AccessoryFlags
import io.github.dfrommi.hapkt.characteristics.FirmwareRevision
import io.github.dfrommi.hapkt.characteristics.HardwareRevision
import io.github.dfrommi.hapkt.characteristics.Identify
import io.github.dfrommi.hapkt.characteristics.Manufacturer
import io.github.dfrommi.hapkt.characteristics.Model
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.SerialNumber
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class AccessoryInformation(
  public val identify: Identify,
  public val manufacturer: Manufacturer,
  public val model: Model,
  public val name: Name,
  public val serialNumber: SerialNumber,
  public val firmwareRevision: FirmwareRevision,
  public val hardwareRevision: HardwareRevision? = null,
  public val accessoryFlags: AccessoryFlags? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "0000003E-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    identify,
    manufacturer,
    model,
    name,
    serialNumber,
    firmwareRevision,
    hardwareRevision,
    accessoryFlags
  )

}
