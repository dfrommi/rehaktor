// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableBooleanCharacteristic
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class Identify(
  public val command: Identify.(Boolean) -> Unit,
) : WritableBooleanCharacteristic {
  public override val type: String = "00000014-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.BOOL

  public override val description: String = "Identify"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override fun execute(targetValue: Boolean): Unit {
    command.invoke(this, targetValue)
  }
}
