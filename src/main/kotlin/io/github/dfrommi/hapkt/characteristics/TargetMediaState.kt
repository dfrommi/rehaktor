// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import java.util.EnumMap
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class TargetMediaState(
  private val observableValue: ObservableValue<Value>,
  public val command: TargetMediaState.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<TargetMediaState.Value>,
  WritableFixedValuesCharacteristic<TargetMediaState.Value> {
  public override val type: String = "00000137-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Target Media State"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(
    mapOf(
      Value.PLAY to 0,
      Value.PAUSE to 1,
      Value.STOP to 2,
    ),
  )

  public constructor(`value`: Value, command: TargetMediaState.(Value) -> Unit) :
    this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit) {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value) {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    PLAY,
    PAUSE,
    STOP,
  }
}
