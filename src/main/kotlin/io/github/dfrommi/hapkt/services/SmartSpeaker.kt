// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.ConfiguredName
import io.github.dfrommi.hapkt.characteristics.CurrentMediaState
import io.github.dfrommi.hapkt.characteristics.Mute
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.TargetMediaState
import io.github.dfrommi.hapkt.characteristics.Volume
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class SmartSpeaker(
  public val currentMediaState: CurrentMediaState,
  public val targetMediaState: TargetMediaState,
  public val configuredName: ConfiguredName? = null,
  public val volume: Volume? = null,
  public val mute: Mute? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000228-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    currentMediaState,
    targetMediaState,
    configuredName,
    volume,
    mute,
    name
  )

}
