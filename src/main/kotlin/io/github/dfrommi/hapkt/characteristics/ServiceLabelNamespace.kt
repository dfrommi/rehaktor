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

public open class ServiceLabelNamespace(
  public override val `value`: Value,
) : ReadableFixedValuesCharacteristic<ServiceLabelNamespace.Value> {
  public override val type: String = "000000CD-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Service Label Namespace"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.DOTS to 0,
  Value.ARABIC_NUMERALS to 1,
  ))


  public enum class Value {
    DOTS,
    ARABIC_NUMERALS,
    ;

    public fun toBoolean() = this == ARABIC_NUMERALS

    public companion object {
      public fun from(v: Boolean) = if(v) ARABIC_NUMERALS else DOTS
    }
  }
}
