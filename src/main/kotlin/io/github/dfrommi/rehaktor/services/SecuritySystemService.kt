// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class SecuritySystemService(
  securitySystemCurrentState: SecuritySystemCurrentStateCharacteristic,
  securitySystemTargetState: SecuritySystemTargetStateCharacteristic,
  statusFault: StatusFaultCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  securitySystemAlarmType: SecuritySystemAlarmTypeCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
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
