// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.SelectedRTPStreamConfiguration
import io.github.dfrommi.hapkt.characteristics.SetupEndpoints
import io.github.dfrommi.hapkt.characteristics.StreamingStatus
import io.github.dfrommi.hapkt.characteristics.SupportedAudioStreamConfiguration
import io.github.dfrommi.hapkt.characteristics.SupportedRTPConfiguration
import io.github.dfrommi.hapkt.characteristics.SupportedVideoStreamConfiguration
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class CameraRTPStreamManagement(
  public val supportedVideoStreamConfiguration: SupportedVideoStreamConfiguration,
  public val supportedAudioStreamConfiguration: SupportedAudioStreamConfiguration,
  public val supportedRTPConfiguration: SupportedRTPConfiguration,
  public val selectedRTPStreamConfiguration: SelectedRTPStreamConfiguration,
  public val streamingStatus: StreamingStatus,
  public val setupEndpoints: SetupEndpoints,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000110-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    supportedVideoStreamConfiguration,
    supportedAudioStreamConfiguration,
    supportedRTPConfiguration,
    selectedRTPStreamConfiguration,
    streamingStatus,
    setupEndpoints,
    name
  )

}
