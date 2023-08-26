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

public open class RelativeHumidityHumidifierThreshold(
  private val observableValue: ObservableValue<Double>,
  public val command: RelativeHumidityHumidifierThreshold.(Double) -> Unit,
) : ObservableDoubleCharacteristic, WritableDoubleCharacteristic {
  public override val type: String = "000000CA-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.FLOAT

  public override val description: String = "Relative Humidity Humidifier Threshold"

  public override val range: IntRange? = IntRange(0,100)

  public override val step: Double? = 1.0

  public override val unit: ValueUnit? = io.github.dfrommi.hapkt.core.ValueUnit.PERCENTAGE

  public override var `value`: Double
    get() = observableValue.get().truncated(range, step)
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Double, command: RelativeHumidityHumidifierThreshold.(Double) -> Unit)
      : this(ObservableValue(value), command)

  public override fun onValueChange(action: (Double) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Double): Unit {
    command.invoke(this, targetValue)
  }
}
