// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableFixedValuesCharacteristic
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

public open class RotationDirection(
  private val observableValue: ObservableValue<Value>,
  public val command: RotationDirection.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<RotationDirection.Value>,
    WritableFixedValuesCharacteristic<RotationDirection.Value> {
  public override val type: String = "00000028-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.INT32

  public override val description: String = "Rotation Direction"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.CLOCKWISE to 0,
  Value.COUNTER_CLOCKWISE to 1,
  ))


  public constructor(`value`: Value, command: RotationDirection.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    CLOCKWISE,
    COUNTER_CLOCKWISE,
    ;

    public fun toBoolean() = this == COUNTER_CLOCKWISE

    public companion object {
      public fun from(v: Boolean) = if(v) COUNTER_CLOCKWISE else CLOCKWISE
    }
  }
}
