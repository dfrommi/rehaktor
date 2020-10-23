// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ActiveIdentifierCharacteristic
import io.github.dfrommi.rehaktor.characteristics.BrightnessCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ClosedCaptionsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.ConfiguredNameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentMediaStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.DisplayOrderCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.PictureModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.PowerModeSelectionCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RemoteKeyCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SleepDiscoveryModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetMediaStateCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class TelevisionService(
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
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
