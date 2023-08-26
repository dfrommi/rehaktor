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

public open class PairingFeatures(
  public override val `value`: Int,
) : ReadableIntegerCharacteristic {
  public override val type: String = "0000004F-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Pairing Features"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null
}
