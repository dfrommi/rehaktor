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

public open class ActiveIdentifier(
  private val observableValue: ObservableValue<Int>,
  public val command: ActiveIdentifier.(Int) -> Unit,
) : ObservableIntegerCharacteristic, WritableIntegerCharacteristic {
  public override val type: String = "000000E7-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT32

  public override val description: String = "Active Identifier"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Int
    get() = observableValue.get().truncated(range, step)
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Int, command: ActiveIdentifier.(Int) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Int) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Int): Unit {
    command.invoke(this, targetValue)
  }
}
