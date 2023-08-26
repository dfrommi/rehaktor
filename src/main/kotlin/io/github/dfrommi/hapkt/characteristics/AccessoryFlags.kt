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

public open class AccessoryFlags(
  private val observableValue: ObservableValue<Int>,
) : ObservableIntegerCharacteristic {
  public override val type: String = "000000A6-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT32

  public override val description: String = "Accessory Flags"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

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
