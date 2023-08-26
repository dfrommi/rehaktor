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

public open class LockLastKnownAction(
  private val observableValue: ObservableValue<Value>,
) : ObservableFixedValuesCharacteristic<LockLastKnownAction.Value> {
  public override val type: String = "0000001C-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Lock Last Known Action"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: Value
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.SECURED_PHYSICALLY_INTERIOR to 0,
  Value.UNSECURED_PHYSICALLY_INTERIOR to 1,
  Value.SECURED_PHYSICALLY_EXTERIOR to 2,
  Value.UNSECURED_PHYSICALLY_EXTERIOR to 3,
  Value.SECURED_BY_KEYPAD to 4,
  Value.UNSECURED_BY_KEYPAD to 5,
  Value.SECURED_REMOTELY to 6,
  Value.UNSECURED_REMOTELY to 7,
  Value.SECURED_BY_AUTO_SECURE_TIMEOUT to 8,
  ))


  public constructor(`value`: Value) : this(ObservableValue(value))

  public override fun onValueChange(action: (Value) -> Unit): Unit {
    observableValue.onChange(action)
  }

  public enum class Value {
    SECURED_PHYSICALLY_INTERIOR,
    UNSECURED_PHYSICALLY_INTERIOR,
    SECURED_PHYSICALLY_EXTERIOR,
    UNSECURED_PHYSICALLY_EXTERIOR,
    SECURED_BY_KEYPAD,
    UNSECURED_BY_KEYPAD,
    SECURED_REMOTELY,
    UNSECURED_REMOTELY,
    SECURED_BY_AUTO_SECURE_TIMEOUT,
  }
}
