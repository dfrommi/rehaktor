// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableStringCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableStringCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class ConfiguredName(
  private val observableValue: ObservableValue<String>,
  public val command: ConfiguredName.(String) -> Unit,
) : ObservableStringCharacteristic, WritableStringCharacteristic {
  public override val type: String = "000000E3-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.STRING

  public override val description: String = "Configured Name"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: String
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: String, command: ConfiguredName.(String) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (String) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: String): Unit {
    command.invoke(this, targetValue)
  }
}
