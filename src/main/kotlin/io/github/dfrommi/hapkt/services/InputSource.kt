// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.ConfiguredName
import io.github.dfrommi.hapkt.characteristics.CurrentVisibilityState
import io.github.dfrommi.hapkt.characteristics.Identifier
import io.github.dfrommi.hapkt.characteristics.InputDeviceType
import io.github.dfrommi.hapkt.characteristics.InputSourceType
import io.github.dfrommi.hapkt.characteristics.IsConfigured
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.TargetVisibilityState
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class InputSource(
  public val configuredName: ConfiguredName,
  public val inputSourceType: InputSourceType,
  public val isConfigured: IsConfigured,
  public val currentVisibilityState: CurrentVisibilityState,
  public val identifier: Identifier? = null,
  public val inputDeviceType: InputDeviceType? = null,
  public val targetVisibilityState: TargetVisibilityState? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "000000D9-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    configuredName,
    inputSourceType,
    isConfigured,
    currentVisibilityState,
    identifier,
    inputDeviceType,
    targetVisibilityState,
    name
  )

}
