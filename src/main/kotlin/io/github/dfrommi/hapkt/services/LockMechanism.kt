// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.LockCurrentState
import io.github.dfrommi.hapkt.characteristics.LockTargetState
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class LockMechanism(
  public val lockCurrentState: LockCurrentState,
  public val lockTargetState: LockTargetState,
  public val name: Name? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "00000045-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
    lockCurrentState,
    lockTargetState,
    name
  )

}
