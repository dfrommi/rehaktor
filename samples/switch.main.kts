#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:DependsOn("com.github.dfrommi:hap-kt:master-SNAPSHOT")

import io.github.dfrommi.rehaktor.characteristics.OnCharacteristic
import io.github.dfrommi.rehaktor.core.HomekitAccessory
import io.github.dfrommi.rehaktor.core.ObservableValue
import io.github.dfrommi.rehaktor.core.auth.HomekitAuthService
import io.github.dfrommi.rehaktor.services.SwitchService
import io.github.hapjava.server.impl.HomekitServer

val loopbackValue = ObservableValue(false)

val fakeSwitch = HomekitAccessory(
    100, "Fake Switch", listOf(
        SwitchService(
            OnCharacteristic(loopbackValue) {
                println("Setting fake switch to $it")
                loopbackValue.set(it)
            }
        )
    ))

val authInfoService = HomekitAuthService()
val bridge = HomekitServer(9123).createBridge(
    authInfoService, "Test Bridge", "Smart Home", "B2", "42", "A", "B"
)

bridge.addAccessory(fakeSwitch)

println("===============")
println("PIN: ${authInfoService.pin}")
println("===============")

bridge.start()
