// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class SecuritySystemCurrentState(
  private val observableValue: ObservableValue<Value>,
) : ObservableFixedValuesCharacteristic<SecuritySystemCurrentState.Value> {
  public override val type: String = "00000066-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Security System Current State"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.STAY_ARM to 0,
  Value.AWAY_ARM to 1,
  Value.NIGHT_ARM to 2,
  Value.DISARMED to 3,
  Value.ALARM_TRIGGERED to 4,
  ))


  public constructor(`value`: Value) : this(ObservableValue(value))

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public enum class Value {
    STAY_ARM,
    AWAY_ARM,
    NIGHT_ARM,
    DISARMED,
    ALARM_TRIGGERED,
  }
}
