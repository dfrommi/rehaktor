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

public open class TargetHumidifierDehumidifierState(
  private val observableValue: ObservableValue<Value>,
  public val command: TargetHumidifierDehumidifierState.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<TargetHumidifierDehumidifierState.Value>,
    WritableFixedValuesCharacteristic<TargetHumidifierDehumidifierState.Value> {
  public override val type: String = "000000B4-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Target Humidifier Dehumidifier State"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.HUMIDIFIER_OR_DEHUMIDIFIER to 0,
  Value.HUMIDIFIER to 1,
  Value.DEHUMIDIFIER to 2,
  ))


  public constructor(`value`: Value, command: TargetHumidifierDehumidifierState.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    HUMIDIFIER_OR_DEHUMIDIFIER,
    HUMIDIFIER,
    DEHUMIDIFIER,
  }
}