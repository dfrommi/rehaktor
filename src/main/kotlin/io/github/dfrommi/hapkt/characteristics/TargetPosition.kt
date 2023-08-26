// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableIntegerCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableIntegerCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class TargetPosition(
  private val observableValue: ObservableValue<Int>,
  public val command: TargetPosition.(Int) -> Unit,
) : ObservableIntegerCharacteristic, WritableIntegerCharacteristic {
  public override val type: String = "0000007C-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Target Position"

  public override val range: IntRange? = IntRange(0,100)

  public override val step: Double? = 1.0

  public override val unit: ValueUnit? = io.github.dfrommi.hapkt.core.ValueUnit.PERCENTAGE

  public override var `value`: Int
    get() = observableValue.get().truncated(range, step)
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Int, command: TargetPosition.(Int) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Int) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Int): Unit {
    command.invoke(this, targetValue)
  }
}
