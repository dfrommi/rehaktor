// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ConfiguredNameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentVisibilityStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.IdentifierCharacteristic
import io.github.dfrommi.rehaktor.characteristics.InputDeviceTypeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.InputSourceTypeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.IsConfiguredCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetVisibilityStateCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class InputSourceService(
  configuredName: ConfiguredNameCharacteristic,
  inputSourceType: InputSourceTypeCharacteristic,
  isConfigured: IsConfiguredCharacteristic,
  currentVisibilityState: CurrentVisibilityStateCharacteristic,
  identifier: IdentifierCharacteristic? = null,
  inputDeviceType: InputDeviceTypeCharacteristic? = null,
  targetVisibilityState: TargetVisibilityStateCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
