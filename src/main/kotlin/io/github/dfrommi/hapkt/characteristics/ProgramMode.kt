// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class ProgramMode(
  private val observableValue: ObservableValue<Value>,
) : ObservableFixedValuesCharacteristic<ProgramMode.Value> {
  public override val type: String = "000000D1-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Program Mode"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.NO_PROGRAM_SCHEDULED to 0,
  Value.PROGRAM_SCHEDULED to 1,
  Value.PROGRAM_SCHEDULED_MANUAL_MODE to 2,
  ))


  public constructor(`value`: Value) : this(ObservableValue(value))

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public enum class Value {
    NO_PROGRAM_SCHEDULED,
    PROGRAM_SCHEDULED,
    PROGRAM_SCHEDULED_MANUAL_MODE,
  }
}
