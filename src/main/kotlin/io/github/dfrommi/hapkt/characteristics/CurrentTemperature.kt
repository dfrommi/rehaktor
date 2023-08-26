// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableDoubleCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class CurrentTemperature(
  private val observableValue: ObservableValue<Double>,
) : ObservableDoubleCharacteristic {
  public override val type: String = "00000011-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.FLOAT

  public override val description: String = "Current Temperature"

  public override val range: IntRange? = IntRange(0,100)

  public override val step: Double? = 0.1

  public override val unit: ValueUnit? = io.github.dfrommi.hapkt.core.ValueUnit.CELSIUS

  public override var `value`: Double
    get() = observableValue.get().truncated(range, step)
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Double) : this(ObservableValue(value))

  public override fun onValueChange(action: (Double) -> Unit): Unit {
    observableValue.onChange(action)
  }
}