// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableIntegerCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class BatteryLevel(
  private val observableValue: ObservableValue<Int>,
) : ObservableIntegerCharacteristic {
  public override val type: String = "00000068-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Battery Level"

  public override val range: IntRange? = IntRange(0,100)

  public override val step: Double? = 1.0

  public override val unit: ValueUnit? = io.github.dfrommi.hapkt.core.ValueUnit.PERCENTAGE

  public override var `value`: Int
    get() = observableValue.get().truncated(range, step)
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Int) : this(ObservableValue(value))

  public override fun onValueChange(action: (Int) -> Unit): Unit {
    observableValue.onChange(action)
  }
}
