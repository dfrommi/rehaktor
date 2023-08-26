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

public open class TargetFanState(
  private val observableValue: ObservableValue<Value>,
  public val command: TargetFanState.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<TargetFanState.Value>,
    WritableFixedValuesCharacteristic<TargetFanState.Value> {
  public override val type: String = "000000BF-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Target Fan State"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.MANUAL to 0,
  Value.AUTO to 1,
  ))


  public constructor(`value`: Value, command: TargetFanState.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    MANUAL,
    AUTO,
    ;

    public fun toBoolean() = this == AUTO

    public companion object {
      public fun from(v: Boolean) = if(v) AUTO else MANUAL
    }
  }
}
