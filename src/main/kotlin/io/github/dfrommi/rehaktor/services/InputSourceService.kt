// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class InputSourceService(
  configuredName: ConfiguredNameCharacteristic,
  inputSourceType: InputSourceTypeCharacteristic,
  isConfigured: IsConfiguredCharacteristic,
  currentVisibilityState: CurrentVisibilityStateCharacteristic,
  identifier: IdentifierCharacteristic? = null,
  inputDeviceType: InputDeviceTypeCharacteristic? = null,
  targetVisibilityState: TargetVisibilityStateCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000D9-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      configuredName,
      inputSourceType,
      isConfigured,
      currentVisibilityState,
      identifier,
      inputDeviceType,
      targetVisibilityState,
      name
    ),
    linkedServices = linkedServices
  )
