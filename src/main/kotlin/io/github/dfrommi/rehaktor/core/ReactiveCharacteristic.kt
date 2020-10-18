package io.github.dfrommi.rehaktor.core

import io.github.hapjava.characteristics.HomekitCharacteristicChangeCallback
import io.github.hapjava.characteristics.impl.base.BaseCharacteristic
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.lang.Double.max
import java.lang.Double.min
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import javax.json.Json
import javax.json.JsonNumber
import javax.json.JsonObject
import javax.json.JsonObjectBuilder
import javax.json.JsonString
import javax.json.JsonValue
import kotlin.math.round
import kotlin.math.truncate
import kotlin.reflect.KClass

enum class Format(val raw: String) {
    BOOL("bool"),
    INT("int"),
    INT32("int32"),
    FLOAT("float"),
    STRING("string"),
    UINT8("uint8"),
    UINT16("uint16"),
    UINT32("uint32"),
    UINT64("uint64"),
    DATA("data"),
    TLV8("tlv8"),
    ARRAY("array"), //Not in HAP Spec
    DICTIONARY("dict") //Not in HAP Spec
}

enum class ValueUnit(val raw: String) {
    CELSIUS("celsius"),
    PERCENTAGE("percentage"),
    ARCDEGREES("arcdegrees"),
    LUX("lux"),
    SECONDS("seconds")
}

abstract class ReactiveCharacteristic<T>(
    private val type: String,
    private val format: Format,
    private val description: String,
    private val defaultValue: T,
    private val values: Flux<T>?,
    private val isObservable: Boolean,
    private val setter: ((T) -> Any?)?
) : BaseCharacteristic<T>(
    type,
    format.raw,
    description,
    values != null,
    setter != null,
    if (isObservable) Optional.of(Consumer {}) else Optional.empty(),
    if (isObservable) Optional.of(Runnable {}) else Optional.empty(),
) {
    private var callback: HomekitCharacteristicChangeCallback? = null
    private var _value: T = defaultValue

    init {
        values?.subscribe {
            _value = it
            callback?.changed()
        }
    }

    override fun subscribe(callback: HomekitCharacteristicChangeCallback) {
        this.callback = callback
    }

    override fun unsubscribe() {
        this.callback = null
    }

    override fun getValue(): CompletableFuture<T> {
        return CompletableFuture.completedFuture(_value)
    }

    override fun setValue(value: T) {
        if (setter == null) return

        val result = setter.invoke(value)

        when (result) {
            is Flux<*> -> result.subscribe()
            is Mono<*> -> result.subscribe()
        }
    }

    override fun getDefault(): T {
        return _value
    }
}

open class BooleanReactiveCharacteristic(
    val type: String,
    val description: String,
    val values: Flux<Boolean>? = null,
    val isObservable: Boolean = values != null,
    val setter: ((Boolean) -> Any?)? = null
) : ReactiveCharacteristic<Boolean>(
    type = type,
    format = Format.BOOL,
    description = description,
    defaultValue = false,
    values = values,
    isObservable = isObservable,
    setter = setter
) {
    override fun convert(jsonValue: JsonValue): Boolean {
        return if (jsonValue.valueType == JsonValue.ValueType.NUMBER) {
            (jsonValue as JsonNumber).intValue() > 0
        } else jsonValue == JsonValue.TRUE
    }
}

open class IntegerReactiveCharacteristic(
    val type: String,
    val description: String,
    val minValue: Int = 0,
    val maxValue: Int? = null,
    val minStep: Int? = null,
    val unit: ValueUnit? = null,
    val format: Format = Format.UINT32,
    val values: Flux<Int>? = null,
    val isObservable: Boolean = values != null,
    val setter: ((Int) -> Any?)? = null
) : ReactiveCharacteristic<Int>(
    type = type,
    format = format,
    description = description,
    defaultValue = minValue,
    isObservable = isObservable,
    values = values,
    setter = setter
) {
    override fun makeBuilder(iid: Int) = super.makeBuilder(iid)
        .thenApply { b ->
            maxValue?.let { b.add("maxValue", it) }
            minStep?.let { b.add("minStep", it) }
            unit?.let { b.add("unit", it.raw) }

            b.add("minValue", minValue)
        }

    override fun convert(jsonValue: JsonValue) = (jsonValue as JsonNumber).intValue()
}

open class DoubleReactiveCharacteristic(
    val type: String,
    val description: String,
    val minValue: Double = 0.0,
    val maxValue: Double? = null,
    val minStep: Double = 0.1,
    val unit: ValueUnit? = null,
    val values: Flux<Double>? = null,
    val isObservable: Boolean = values != null,
    val setter: ((Double) -> Any?)? = null
) : ReactiveCharacteristic<Double>(
    type = type,
    format = Format.FLOAT,
    description = description,
    defaultValue = minValue,
    isObservable = isObservable,
    values = values?.map {
        val rounder = truncate(1 / minStep)
        val v = round(it * rounder) / rounder

        min(max(v, minValue), maxValue ?: Double.MAX_VALUE)
    },
    setter = setter
) {
    override fun makeBuilder(iid: Int) = super.makeBuilder(iid)
        .thenApply { b ->
            unit?.let { b.add("unit", it.raw) }
            maxValue?.let { b.add("maxValue", it) }

            b.add("minValue", minValue)
                .add("minStep", 1)
        }

    override fun convert(jsonValue: JsonValue) = (jsonValue as JsonNumber).doubleValue()
}

open class EnumReactiveCharacteristic<E : Enum<E>>(
    type: String,
    description: String,
    val enumClass: KClass<E>,
    format: Format = Format.UINT8,
    maxValue: Int = enumClass.java.enumConstants.maxOf { e -> e.ordinal },
    values: Flux<E>? = null,
    isObservable: Boolean = values != null,
    setter: ((E) -> Any?)? = null
) : IntegerReactiveCharacteristic(
    type = type,
    format = format,
    description = description,
    minValue = 0,
    maxValue = maxValue,
    isObservable = isObservable,
    values = values?.map { it.ordinal },
    setter = setter?.let {
        { index ->
            val e = enumClass.java.enumConstants.find { it.ordinal == index }
                ?: throw IllegalArgumentException("Value $index can't be mapped to enum ${enumClass.simpleName}")
            it.invoke(e)
        }
    }
) {
    override fun makeBuilder(iid: Int) = super.makeBuilder(iid)
        .thenApply { b ->
            val validValues = Json.createArrayBuilder()
            enumClass.java.enumConstants
                .map { it.ordinal }
                .sorted()
                .forEach { validValues.add(it) }

            b.add("valid-values", validValues)
        }

    override fun convert(jsonValue: JsonValue) = when (jsonValue) {
        is JsonNumber -> jsonValue.intValue()
        JsonObject.TRUE -> 1 // For at least one enum type (locks), homekit will send a true instead of 1
        JsonObject.FALSE -> 0
        else -> throw IndexOutOfBoundsException("$description: cannot convert ${jsonValue.javaClass} with $jsonValue to int")
    }
}

open class StringReactiveCharacteristic(
    val type: String,
    val description: String,
    val values: Flux<String>? = null,
    val isObservable: Boolean = values != null,
    val setter: ((String) -> Any?)? = null
) : ReactiveCharacteristic<String>(
    type = type,
    format = Format.STRING,
    description = description,
    defaultValue = "Unknown",
    isObservable = isObservable,
    values = values,
    setter = setter
) {
    override fun convert(jsonValue: JsonValue) = (jsonValue as JsonString).string
}

open class TlvReactiveCharacteristic(
    val type: String,
    val description: String,
    val values: Flux<ByteArray>? = null,
    val isObservable: Boolean = values != null,
    val setter: ((ByteArray) -> Any?)? = null
) : ReactiveCharacteristic<ByteArray>(
    type = type,
    format = Format.TLV8,
    description = description,
    defaultValue = byteArrayOf(),
    isObservable = isObservable,
    values = values,
    setter = setter
) {
    private val encoder = Base64.getEncoder()
    private val decoder = Base64.getDecoder()

    override fun convert(jsonValue: JsonValue) = decoder.decode((jsonValue as JsonString).string)

    override fun setJsonValue(builder: JsonObjectBuilder, value: ByteArray) {
        builder.add("value", encoder.encodeToString(value))
    }
}
