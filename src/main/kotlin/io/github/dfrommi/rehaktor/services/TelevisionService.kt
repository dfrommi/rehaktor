// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class TelevisionService(
  active: ActiveCharacteristic,
  activeIdentifier: ActiveIdentifierCharacteristic,
  configuredName: ConfiguredNameCharacteristic,
  sleepDiscoveryMode: SleepDiscoveryModeCharacteristic,
  brightness: BrightnessCharacteristic? = null,
  closedCaptions: ClosedCaptionsCharacteristic? = null,
  displayOrder: DisplayOrderCharacteristic? = null,
  currentMediaState: CurrentMediaStateCharacteristic? = null,
  targetMediaState: TargetMediaStateCharacteristic? = null,
  pictureMode: PictureModeCharacteristic? = null,
  powerModeSelection: PowerModeSelectionCharacteristic? = null,
  remoteKey: RemoteKeyCharacteristic? = null,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000D8-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      active,
      activeIdentifier,
      configuredName,
      sleepDiscoveryMode,
      brightness,
      closedCaptions,
      displayOrder,
      currentMediaState,
      targetMediaState,
      pictureMode,
      powerModeSelection,
      remoteKey,
      name
    ),
    linkedServices = linkedServices
  )
