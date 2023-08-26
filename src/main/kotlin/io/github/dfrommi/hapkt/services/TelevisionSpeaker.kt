// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.Mute
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.Volume
import io.github.dfrommi.hapkt.characteristics.VolumeControlType
import io.github.dfrommi.hapkt.characteristics.VolumeSelector
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class TelevisionSpeaker(
  public val mute: Mute,
  public val active: Active? = null,
  public val volume: Volume? = null,
  public val volumeControlType: VolumeControlType? = null,
  public val volumeSelector: VolumeSelector? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000113-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    mute,
    active,
    volume,
    volumeControlType,
    volumeSelector,
    name
  )

}
