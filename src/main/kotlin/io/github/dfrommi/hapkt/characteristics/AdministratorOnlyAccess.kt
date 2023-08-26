// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableBooleanCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableBooleanCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.Boolean
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class AdministratorOnlyAccess(
  private val observableValue: ObservableValue<Boolean>,
  public val command: AdministratorOnlyAccess.(Boolean) -> Unit,
) : ObservableBooleanCharacteristic, WritableBooleanCharacteristic {
  public override val type: String = "00000001-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.BOOL

  public override val description: String = "Administrator Only Access"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Boolean
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: Boolean, command: AdministratorOnlyAccess.(Boolean) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Boolean) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Boolean): Unit {
    command.invoke(this, targetValue)
  }
}
