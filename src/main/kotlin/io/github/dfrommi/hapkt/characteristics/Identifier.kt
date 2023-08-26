// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ReadableIntegerCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.ranges.IntRange

public open class Identifier(
  public override val `value`: Int,
) : ReadableIntegerCharacteristic {
  public override val type: String = "000000E6-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT32

  public override val description: String = "Identifier"

  public override val range: IntRange? = null

  public override val step: Double? = 1.0

  public override val unit: ValueUnit? = null
}
