// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ReadableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class SlatType(
  public override val `value`: Value,
) : ReadableFixedValuesCharacteristic<SlatType.Value> {
  public override val type: String = "000000C0-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Slat Type"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.HORIZONTAL to 0,
  Value.VERTICAL to 1,
  ))


  public enum class Value {
    HORIZONTAL,
    VERTICAL,
    ;

    public fun toBoolean() = this == VERTICAL

    public companion object {
      public fun from(v: Boolean) = if(v) VERTICAL else HORIZONTAL
    }
  }
}
