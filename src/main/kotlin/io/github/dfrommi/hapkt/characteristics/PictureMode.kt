// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class PictureMode(
  private val observableValue: ObservableValue<Value>,
  public val command: PictureMode.(Value) -> Unit,
) : ObservableFixedValuesCharacteristic<PictureMode.Value>,
    WritableFixedValuesCharacteristic<PictureMode.Value> {
  public override val type: String = "000000E2-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT16

  public override val description: String = "Picture Mode"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.OTHER to 0,
  Value.STANDARD to 1,
  Value.CALIBRATED to 2,
  Value.CALIBRATED_DARK to 3,
  Value.VIVID to 4,
  Value.GAME to 5,
  Value.COMPUTER to 6,
  Value.CUSTOM to 7,
  Value.UNKNOWN_1 to 8,
  Value.UNKNOWN_2 to 9,
  Value.UNKNOWN_3 to 10,
  Value.UNKNOWN_4 to 11,
  Value.UNKNOWN_5 to 12,
  Value.UNKNOWN_6 to 13,
  ))


  public constructor(`value`: Value, command: PictureMode.(Value) -> Unit) :
      this(ObservableValue(value), command)

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    OTHER,
    STANDARD,
    CALIBRATED,
    CALIBRATED_DARK,
    VIVID,
    GAME,
    COMPUTER,
    CUSTOM,
    UNKNOWN_1,
    UNKNOWN_2,
    UNKNOWN_3,
    UNKNOWN_4,
    UNKNOWN_5,
    UNKNOWN_6,
  }
}
