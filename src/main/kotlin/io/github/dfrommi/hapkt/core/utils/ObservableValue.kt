package io.github.dfrommi.hapkt.core.utils

class ObservableValue<T>(private var value: T) {
  private val listeners = mutableListOf<(T) -> Unit>()

  fun set(value: T) {
    if (this.value != value) {
      this.value = value
      listeners.forEach { it(value) }
    }
  }

  fun get(): T {
    return value;
  }

  fun onChange(action: (T) -> Unit) {
    listeners.add(action)
  }
}