// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class SecuritySystemTargetState(
  private val observableValue: ObservableValue<Value>,
  public val command: SecuritySystemTargetState.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<SecuritySystemTargetState.Value>,
    WritableFixedValuesCharacteristic<SecuritySystemTargetState.Value> {
  public override val type: String = "00000067-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Security System Target State"

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
  Value.DISARM to 3,
  ))


  public constructor(`value`: Value, command: SecuritySystemTargetState.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    STAY_ARM,
    AWAY_ARM,
    NIGHT_ARM,
    DISARM,
  }
}
