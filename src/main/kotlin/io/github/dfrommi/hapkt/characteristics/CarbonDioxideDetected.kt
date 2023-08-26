// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class CarbonDioxideDetected(
  private val observableValue: ObservableValue<Value>,
) : ObservableFixedValuesCharacteristic<CarbonDioxideDetected.Value> {
  public override val type: String = "00000092-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Carbon Dioxide Detected"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.CO2_LEVELS_NORMAL to 0,
  Value.CO2_LEVELS_ABNORMAL to 1,
  ))


  public constructor(`value`: Value) : this(ObservableValue(value))

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public enum class Value {
    CO2_LEVELS_NORMAL,
    CO2_LEVELS_ABNORMAL,
    ;

    public fun toBoolean() = this == CO2_LEVELS_ABNORMAL

    public companion object {
      public fun from(v: Boolean) = if(v) CO2_LEVELS_ABNORMAL else CO2_LEVELS_NORMAL
    }
  }
}
