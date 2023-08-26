// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.characteristics

import io.github.dfrommi.hapkt.core.Format
import io.github.dfrommi.hapkt.core.ReadableTlvCharacteristic
import io.github.dfrommi.hapkt.core.ValueUnit
import io.github.dfrommi.hapkt.core.WritableTlvCharacteristic
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.ByteArray
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.ranges.IntRange

public open class SetupEndpoints(
  public override val `value`: ByteArray,
  public val command: SetupEndpoints.(ByteArray) -> Unit,
) : ReadableTlvCharacteristic, WritableTlvCharacteristic {
  public override val type: String = "00000118-0000-1000-8000-0026BB765291"

  public override val format: Format = io.github.dfrommi.hapkt.core.Format.TLV8

  public override val description: String = "Setup Endpoints"

  public override val range: IntRange? = null

  public override val step: Double? = null

  public override val unit: ValueUnit? = null

  public override fun execute(targetValue: ByteArray): Unit {
    command.invoke(this, targetValue)
  }
}
