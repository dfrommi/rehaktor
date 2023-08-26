package io.github.dfrommi.hapkt.core.engine.hapjava.adapter

import io.github.dfrommi.hapkt.core.BooleanCharacteristic
import io.github.dfrommi.hapkt.core.DoubleCharacteristic
import io.github.dfrommi.hapkt.core.FixedValuesCharacteristic
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.IntegerCharacteristic
import io.github.dfrommi.hapkt.core.ObservableHomekitCharacteristic
import io.github.dfrommi.hapkt.core.ReadableHomekitCharacteristic
import io.github.dfrommi.hapkt.core.StringCharacteristic
import io.github.dfrommi.hapkt.core.TlvCharacteristic
import io.github.dfrommi.hapkt.core.WritableHomekitCharacteristic
import io.github.hapjava.characteristics.HomekitCharacteristicChangeCallback
import io.github.hapjava.characteristics.impl.base.BaseCharacteristic
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import javax.json.Json
import javax.json.JsonNumber
import javax.json.JsonObject
import javax.json.JsonObjectBuilder
import javax.json.JsonString
import javax.json.JsonValue

fun <T> HomekitCharacteristic<T>.toHapJava() = when(this) {
  is BooleanCharacteristic -> HapJavaBooleanCharacteristicAdapter(this)
  is IntegerCharacteristic -> HapJavaIntegerCharacteristicAdapter(this)
  is DoubleCharacteristic -> HapJavaDoubleCharacteristicAdapter(this)
  is StringCharacteristic -> HapJavaStringCharacteristicAdapter(this)
  is TlvCharacteristic -> HapJavaTlvCharacteristicAdapter(this)
  is FixedValuesCharacteristic<*> -> HapJavaFixedValuesCharacteristicAdapter(this)
}

abstract class HapJavaCharacteristicAdapter<J, K>(
  private val delegate: HomekitCharacteristic<K>
) : BaseCharacteristic<J>(
  delegate.type,
  delegate.format.raw,
  delegate.description,
  delegate is ReadableHomekitCharacteristic<K>,
  delegate is WritableHomekitCharacteristic<K>,
  if (delegate is ObservableHomekitCharacteristic<K>) Optional.of(Consumer {}) else Optional.empty(),
  if (delegate is ObservableHomekitCharacteristic<K>) Optional.of(Runnable {}) else Optional.empty()
) {
  private var callback: HomekitCharacteristicChangeCallback? = null
  private var defaultValue: K? = (delegate as? ReadableHomekitCharacteristic<K>)?.value

  init {
    if (delegate is ObservableHomekitCharacteristic<K>) {
      delegate.onValueChange {
        callback?.changed()
      }
    }
  }

  override fun subscribe(callback: HomekitCharacteristicChangeCallback) {
    this.callback = callback
  }

  override fun unsubscribe() {
    this.callback = null
  }

  override fun getValue(): CompletableFuture<J> {
    return CompletableFuture.completedFuture((delegate as? ReadableHomekitCharacteristic<K>)?.value?.toJ())
  }

  override fun setValue(value: J) {
    (delegate as? WritableHomekitCharacteristic<K>)?.execute(value.toK())
  }

  override fun getDefault(): J? {
    return defaultValue?.toJ()
  }

  override fun makeBuilder(iid: Int): CompletableFuture<JsonObjectBuilder> = super.makeBuilder(iid)
    .thenApply { b ->
      delegate.range?.let {
        b.add("minValue", it.first)
        b.add("maxValue", it.last)
      }
      delegate.step?.let { b.add("minStep", it) }
      delegate.unit?.let { b.add("unit", it.raw) }

      b
    }

  protected abstract fun J.toK(): K
  protected abstract fun K.toJ(): J
}

class HapJavaBooleanCharacteristicAdapter(delegate: BooleanCharacteristic): HapJavaCharacteristicAdapter<Boolean, Boolean>(delegate) {
  override fun Boolean.toK() = this
  override fun Boolean.toJ() = this

  override fun convert(jsonValue: JsonValue): Boolean {
    return if (jsonValue.valueType == JsonValue.ValueType.NUMBER) {
      (jsonValue as JsonNumber).intValue() > 0
    } else jsonValue == JsonValue.TRUE
  }
}

class HapJavaIntegerCharacteristicAdapter(delegate: IntegerCharacteristic): HapJavaCharacteristicAdapter<Int, Int>(delegate) {
  override fun Int.toK() = this
  override fun Int.toJ() = this

  override fun convert(jsonValue: JsonValue): Int {
    return when (jsonValue) {
      is JsonNumber -> jsonValue.intValue()
      JsonObject.TRUE -> 1 // For at least one enum type (locks), homekit will send a true instead of 1
      JsonObject.FALSE -> 0
      else -> throw IllegalArgumentException("Json-value $jsonValue can't be converted to integer")
    }
  }
}

class HapJavaDoubleCharacteristicAdapter(delegate: DoubleCharacteristic): HapJavaCharacteristicAdapter<Double, Double>(delegate) {
  override fun Double.toK() = this
  override fun Double.toJ() = this

  override fun convert(jsonValue: JsonValue): Double {
    return (jsonValue as JsonNumber).doubleValue()
  }
}

class HapJavaStringCharacteristicAdapter(delegate: StringCharacteristic): HapJavaCharacteristicAdapter<String, String>(delegate) {
  override fun String.toK() = this
  override fun String.toJ() = this

  override fun convert(jsonValue: JsonValue): String {
    return (jsonValue as JsonString).string
  }
}

class HapJavaTlvCharacteristicAdapter(delegate: TlvCharacteristic): HapJavaCharacteristicAdapter<ByteArray, ByteArray>(delegate) {
  companion object {
    private val tlvEncoder = Base64.getEncoder()
    private val tlvDecoder = Base64.getDecoder()
  }

  override fun ByteArray.toK() = this
  override fun ByteArray.toJ() = this

  override fun setJsonValue(builder: JsonObjectBuilder, value: ByteArray) {
    builder.add("value", tlvEncoder.encodeToString(value))
  }

  override fun convert(jsonValue: JsonValue): ByteArray {
    return tlvDecoder.decode((jsonValue as JsonString).string)
  }
}

class HapJavaFixedValuesCharacteristicAdapter<E: Enum<E>>(private val delegate: FixedValuesCharacteristic<E>): HapJavaCharacteristicAdapter<Int, E>(delegate) {
  private val validValuesReverse = delegate.validValues.map { it.value to it.key }.toMap()

  override fun Int.toK(): E = validValuesReverse.getValue(this)
  override fun E.toJ(): Int = delegate.validValues.getValue(this)

  override fun convert(jsonValue: JsonValue): Int {
    return (jsonValue as JsonNumber).intValue()
  }

  override fun makeBuilder(iid: Int): CompletableFuture<JsonObjectBuilder> = super.makeBuilder(iid)
    .thenApply { b ->
      val validValues = Json.createArrayBuilder()
      delegate.validValues.values.sorted().forEach(validValues::add)
      b.add("valid-values", validValues)
    }
}
