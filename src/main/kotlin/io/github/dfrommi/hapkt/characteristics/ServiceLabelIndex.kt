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

public open class ServiceLabelIndex(
  public override val `value`: Int,
) : ReadableIntegerCharacteristic {
  public override val type: String = "000000CB-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Service Label Index"

  public override val range: IntRange? = IntRange(1,255)

  public override val step: Double? = 1.0

  public override val unit: ValueUnit? = null
}
