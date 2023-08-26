// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableFixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.utils.truncated
import java.util.EnumMap
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.ranges.IntRange

public open class RemoteKey(
  public val command: RemoteKey.(Value) -> Unit,
) : WritableFixedValuesCharacteristic<RemoteKey.Value> {
  public override val type: String = "000000E1-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.UINT8

  public override val description: String = "Remote Key"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override val validValues: Map<Value, Int> = EnumMap(mapOf(
  Value.REWIND to 0,
  Value.FASTFORWARD to 1,
  Value.NEXTTRACK to 2,
  Value.PREVTRACK to 3,
  Value.ARROWUP to 4,
  Value.ARROWDOWN to 5,
  Value.ARROWLEFT to 6,
  Value.ARROWRIGHT to 7,
  Value.SELECT to 8,
  Value.BACK to 9,
  Value.EXIT to 10,
  Value.PLAYPAUSE to 11,
  Value.UNKNOWN_1 to 12,
  Value.UNKNOWN_2 to 13,
  Value.UNKNOWN_3 to 14,
  Value.INFO to 15,
  Value.UNKNOWN_4 to 16,
  ))


  public override fun execute(targetValue: Value): Unit {
    command.invoke(this, targetValue)
  }

  public enum class Value {
    REWIND,
    FASTFORWARD,
    NEXTTRACK,
    PREVTRACK,
    ARROWUP,
    ARROWDOWN,
    ARROWLEFT,
    ARROWRIGHT,
    SELECT,
    BACK,
    EXIT,
    PLAYPAUSE,
    UNKNOWN_1,
    UNKNOWN_2,
    UNKNOWN_3,
    INFO,
    UNKNOWN_4,
  }
}
