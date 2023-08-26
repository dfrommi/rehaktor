// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableDoubleCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableDoubleCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class DigitalZoom(
  private val observableValue: ObservableValue<Double>,
  public val command: DigitalZoom.(Double) -> Unit,
) : ObservableDoubleCharacteristic, WritableDoubleCharacteristic {
  public override val type: String = "0000011D-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.FLOAT

  public override val description: String = "Digital Zoom"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Double
    get() = observableValue.get().truncated(range, step)
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Double, command: DigitalZoom.(Double) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Double) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Double): Unit {
    command.invoke(this, targetValue)
  }
}