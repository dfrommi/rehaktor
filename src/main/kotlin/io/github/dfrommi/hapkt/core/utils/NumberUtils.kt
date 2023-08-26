package io.github.dfrommi.hapkt.core.utils

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.min

fun Int.truncated(range: IntRange? = null, step: Double? = null): Int {
  return this.toDouble().truncated(range, step).toInt()
}

fun Double.truncated(range: IntRange? = null, step: Double? = null): Double {
  val minValue = range?.first?.toDouble() ?: 0.0
  val maxValue = range?.last?.toDouble() ?: Double.MAX_VALUE
  val stepValue = step ?: 1.0

  // (round((this - minValue) / stepValue) * stepValue) + minValue
  val v = BigDecimal(this - minValue)
    .divide(BigDecimal(stepValue), 0, RoundingMode.HALF_UP)
    .times(BigDecimal(stepValue))
    .plus(BigDecimal(minValue))
    .toDouble()

  return min(max(v, minValue), maxValue)
}
