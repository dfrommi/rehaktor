// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableIntegerCharacteristic
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class ResetFilterIndication(
  public val command: ResetFilterIndication.(Int) -> Unit,
) : WritableIntegerCharacteristic {
  public override val type: String = "000000AD-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Reset Filter Indication"

  public override val range: IntRange? = IntRange(1,1)

  public override val step: Double? = 1.0

  public override val unit: ValueUnit? = null

  public override fun execute(targetValue: Int): Unit {
    command.invoke(this, targetValue)
  }
}
