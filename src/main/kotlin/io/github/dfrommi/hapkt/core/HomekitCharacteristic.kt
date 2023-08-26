package io.github.dfrommi.hapkt.core

enum class Format(val raw: String) {
  BOOL("bool"),
  INT("int"),
  INT32("int32"),
  UINT8("uint8"),
  UINT16("uint16"),
  UINT32("uint32"),
  UINT64("uint64"),
  FLOAT("float"),
  STRING("string"),
  TLV8("tlv8"),
  //DATA("data"),
  //ARRAY("array"), //Not in HAP Spec
  //DICTIONARY("dict") //Not in HAP Spec
}

enum class ValueUnit(val raw: String) {
  CELSIUS("celsius"),
  PERCENTAGE("percentage"),
  ARCDEGREES("arcdegrees"),
  LUX("lux"),
  SECONDS("seconds")
}

sealed interface HomekitCharacteristic<T> {
  val type: String
  val format: Format
  val description: String
  val range: IntRange?
  val step: Double?
  val unit: ValueUnit?
}

sealed interface ReadableHomekitCharacteristic<T>: HomekitCharacteristic<T> {
  val value: T
}

sealed interface ObservableHomekitCharacteristic<T>: ReadableHomekitCharacteristic<T> {
  override var value: T
  fun onValueChange(action: (T) -> Unit)
}

sealed interface WritableHomekitCharacteristic<T>: HomekitCharacteristic<T> {
  fun execute(targetValue: T)
}

sealed interface IntegerCharacteristic: HomekitCharacteristic<Int>
interface ReadableIntegerCharacteristic: IntegerCharacteristic, ReadableHomekitCharacteristic<Int>
interface ObservableIntegerCharacteristic: IntegerCharacteristic, ObservableHomekitCharacteristic<Int>
interface WritableIntegerCharacteristic: IntegerCharacteristic, WritableHomekitCharacteristic<Int>

sealed interface DoubleCharacteristic: HomekitCharacteristic<Double>
interface ReadableDoubleCharacteristic: DoubleCharacteristic, ReadableHomekitCharacteristic<Double>
interface ObservableDoubleCharacteristic: DoubleCharacteristic, ObservableHomekitCharacteristic<Double>
interface WritableDoubleCharacteristic: DoubleCharacteristic, WritableHomekitCharacteristic<Double>

sealed interface StringCharacteristic: HomekitCharacteristic<String>
interface ReadableStringCharacteristic: StringCharacteristic, ReadableHomekitCharacteristic<String>
interface ObservableStringCharacteristic: StringCharacteristic, ObservableHomekitCharacteristic<String>
interface WritableStringCharacteristic: StringCharacteristic, WritableHomekitCharacteristic<String>

sealed interface BooleanCharacteristic: HomekitCharacteristic<Boolean>
interface ReadableBooleanCharacteristic: BooleanCharacteristic, ReadableHomekitCharacteristic<Boolean>
interface ObservableBooleanCharacteristic: BooleanCharacteristic, ObservableHomekitCharacteristic<Boolean>
interface WritableBooleanCharacteristic: BooleanCharacteristic, WritableHomekitCharacteristic<Boolean>

sealed interface FixedValuesCharacteristic<E: Enum<E>>: HomekitCharacteristic<E> {
  val validValues: Map<E, Int>
}
interface ReadableFixedValuesCharacteristic<E: Enum<E>>: FixedValuesCharacteristic<E>, ReadableHomekitCharacteristic<E>
interface ObservableFixedValuesCharacteristic<E: Enum<E>>: FixedValuesCharacteristic<E>, ObservableHomekitCharacteristic<E>
interface WritableFixedValuesCharacteristic<E: Enum<E>>: FixedValuesCharacteristic<E>, WritableHomekitCharacteristic<E>

sealed interface TlvCharacteristic: HomekitCharacteristic<ByteArray>
interface ReadableTlvCharacteristic: TlvCharacteristic, ReadableHomekitCharacteristic<ByteArray>
interface ObservableTlvCharacteristic: TlvCharacteristic, ObservableHomekitCharacteristic<ByteArray>
interface WritableTlvCharacteristic: TlvCharacteristic, WritableHomekitCharacteristic<ByteArray>
