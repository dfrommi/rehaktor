// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SecuritySystemAlarmTypeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SecuritySystemCurrentStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SecuritySystemTargetStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusTamperedCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class SecuritySystemService(
  securitySystemCurrentState: SecuritySystemCurrentStateCharacteristic,
  securitySystemTargetState: SecuritySystemTargetStateCharacteristic,
  statusFault: StatusFaultCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  securitySystemAlarmType: SecuritySystemAlarmTypeCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "0000007E-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      securitySystemCurrentState,
      securitySystemTargetState,
      statusFault,
      statusTampered,
      securitySystemAlarmType,
      name
    ),
    linkedServices = linkedServices
  )
