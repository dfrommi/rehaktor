// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.Brightness
import io.github.dfrommi.hapkt.characteristics.Hue
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.On
import io.github.dfrommi.hapkt.characteristics.Saturation
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class Lightbulb(
  public val on: On,
  public val brightness: Brightness? = null,
  public val hue: Hue? = null,
  public val saturation: Saturation? = null,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000043-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    on,
    brightness,
    hue,
    saturation,
    name
  )

}
