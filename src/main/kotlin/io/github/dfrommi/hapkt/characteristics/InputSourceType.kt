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

public open class InputSourceType(
  private val observableValue: ObservableValue<Value>,
) : ObservableFixedValuesCharacteristic<InputSourceType.Value> {
  public override val type: String = "000000DB-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Input Source Type"

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
  Value.HOME_SCREEN to 1,
  Value.TUNER to 2,
  Value.HDMI to 3,
  Value.COMPOSITE_VIDEO to 4,
  Value.S_VIDEO to 5,
  Value.COMPONENTVIDEO to 6,
  Value.DVI to 7,
  Value.AIRPLAY to 8,
  Value.USB to 9,
  Value.APPLICATION to 10,
  ))


  public constructor(`value`: Value) : this(ObservableValue(value))

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public enum class Value {
    OTHER,
    HOME_SCREEN,
    TUNER,
    HDMI,
    COMPOSITE_VIDEO,
    S_VIDEO,
    COMPONENTVIDEO,
    DVI,
    AIRPLAY,
    USB,
    APPLICATION,
  }
}
