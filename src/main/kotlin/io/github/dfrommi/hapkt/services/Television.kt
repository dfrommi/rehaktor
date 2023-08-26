// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.ActiveIdentifier
import io.github.dfrommi.hapkt.characteristics.Brightness
import io.github.dfrommi.hapkt.characteristics.ClosedCaptions
import io.github.dfrommi.hapkt.characteristics.ConfiguredName
import io.github.dfrommi.hapkt.characteristics.CurrentMediaState
import io.github.dfrommi.hapkt.characteristics.DisplayOrder
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.PictureMode
import io.github.dfrommi.hapkt.characteristics.PowerModeSelection
import io.github.dfrommi.hapkt.characteristics.RemoteKey
import io.github.dfrommi.hapkt.characteristics.SleepDiscoveryMode
import io.github.dfrommi.hapkt.characteristics.TargetMediaState
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class Television(
  public val active: Active,
  public val activeIdentifier: ActiveIdentifier,
  public val configuredName: ConfiguredName,
  public val sleepDiscoveryMode: SleepDiscoveryMode,
  public val brightness: Brightness? = null,
  public val closedCaptions: ClosedCaptions? = null,
  public val displayOrder: DisplayOrder? = null,
  public val currentMediaState: CurrentMediaState? = null,
  public val targetMediaState: TargetMediaState? = null,
  public val pictureMode: PictureMode? = null,
  public val powerModeSelection: PowerModeSelection? = null,
  public val remoteKey: RemoteKey? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000D8-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
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
  )

}
