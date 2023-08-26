// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ObservableTlvCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.ByteArray
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class StreamingStatus(
  private val observableValue: ObservableValue<ByteArray>,
) : ObservableTlvCharacteristic {
  public override val type: String = "00000120-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.TLV8

  public override val description: String = "Streaming Status"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override var `value`: ByteArray
    get() = observableValue.get()
    set(`value`) {
      observableValue.set(value)
    }

  public constructor(`value`: ByteArray) : this(ObservableValue(value))

  public override fun onValueChange(action: (ByteArray) -> Unit): Unit {
    observableValue.onChange(action)
  }
}
