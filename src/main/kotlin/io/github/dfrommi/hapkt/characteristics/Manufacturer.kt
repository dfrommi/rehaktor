// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ReadableStringCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.String
import kotlin.ranges.IntRange

public open class Manufacturer(
  public override val `value`: String,
) : ReadableStringCharacteristic {
  public override val type: String = "00000020-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.STRING

  public override val description: String = "Manufacturer"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null
}
