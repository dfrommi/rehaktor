package io.github.dfrommi.hapkt

import io.github.dfrommi.hapkt.characteristics.Active
import io.github.dfrommi.hapkt.characteristics.ContactSensorState
import io.github.dfrommi.hapkt.characteristics.On
import io.github.dfrommi.hapkt.core.HomekitAccessory
import io.github.dfrommi.hapkt.core.engine.hapjava.HapJavaEngine
import io.github.dfrommi.hapkt.core.engine.hapjava.adapter.toHapJava
import io.github.dfrommi.hapkt.core.utils.ObservableValue
import io.github.dfrommi.hapkt.services.ContactSensor
import io.github.dfrommi.hapkt.services.FanV2
import io.github.dfrommi.hapkt.services.Switch

fun main() {
//  val o = On(false) {}
//  println(o.toHapJava().toJson(123).get().toString())

  val acc = HomekitAccessory(100, "My Switch", listOf(
    Switch(
      on = On(ObservableValue(false)) {
        println("Switch set to $it")
        this.value = it
      }
    ),
  ))

  val acc2 = HomekitAccessory(101, "My Fan", listOf(
    FanV2(
      active = Active(ObservableValue(Active.Value.INACTIVE)) {
        println("Fan status: $it")
        this.value = it
      }
    )
  ))

  val acc3 = HomekitAccessory(102, "My Contact", listOf(
    ContactSensor(
      contactSensorState = ContactSensorState(ObservableValue(ContactSensorState.Value.CONTACT_DETECTED)),
    )
  ))

//  acc.service<Switch>().on.value = true

  val engine = HapJavaEngine("Smart-Home Dev", accessories = setOf(acc, acc2, acc3))
  engine.start()

  println("PIN: " + engine.pin)
}
