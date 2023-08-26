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

public open class TargetDoorState(
  private val observableValue: ObservableValue<Value>,
  public val command: TargetDoorState.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<TargetDoorState.Value>,
    WritableFixedValuesCharacteristic<TargetDoorState.Value> {
  public override val type: String = "00000032-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Target Door State"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.OPEN to 0,
  Value.CLOSED to 1,
  ))


  public constructor(`value`: Value, command: TargetDoorState.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    OPEN,
    CLOSED,
    ;

    public fun toBoolean() = this == CLOSED

    public companion object {
      public fun from(v: Boolean) = if(v) CLOSED else OPEN
    }
  }
}
