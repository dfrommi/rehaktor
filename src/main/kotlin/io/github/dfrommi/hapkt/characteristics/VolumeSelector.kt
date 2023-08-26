// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class VolumeSelector(
  public val command: VolumeSelector.(Value) -> Unit,
) : WritableFixedValuesCharacteristic<VolumeSelector.Value> {
  public override val type: String = "000000EA-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Volume Selector"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.INCREMENT to 0,
  Value.DECREMENT to 1,
  ))


  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    INCREMENT,
    DECREMENT,
    ;

    public fun toBoolean() = this == DECREMENT

    public companion object {
      public fun from(v: Boolean) = if(v) DECREMENT else INCREMENT
    }
  }
}
