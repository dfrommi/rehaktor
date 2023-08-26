// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class LeakDetected(
  private val observableValue: ObservableValue<Value>,
) : ObservableFixedValuesCharacteristic<LeakDetected.Value> {
  public override val type: String = "00000070-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Leak Detected"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.LEAK_NOT_DETECTED to 0,
  Value.LEAK_DETECTED to 1,
  ))


  public constructor(`value`: Value) : this(ObservableValue(value))

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public enum class Value {
    LEAK_NOT_DETECTED,
    LEAK_DETECTED,
    ;

    public fun toBoolean() = this == LEAK_DETECTED

    public companion object {
      public fun from(v: Boolean) = if(v) LEAK_DETECTED else LEAK_NOT_DETECTED
    }
  }
}
