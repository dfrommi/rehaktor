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

public open class SwingMode(
  private val observableValue: ObservableValue<Value>,
  public val command: SwingMode.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<SwingMode.Value>,
    WritableFixedValuesCharacteristic<SwingMode.Value> {
  public override val type: String = "000000B6-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Swing Mode"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.SWING_DISABLED to 0,
  Value.SWING_ENABLED to 1,
  ))


  public constructor(`value`: Value, command: SwingMode.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    SWING_DISABLED,
    SWING_ENABLED,
    ;

    public fun toBoolean() = this == SWING_ENABLED

    public companion object {
      public fun from(v: Boolean) = if(v) SWING_ENABLED else SWING_DISABLED
    }
  }
}
