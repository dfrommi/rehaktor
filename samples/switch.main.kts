#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:DependsOn("com.github.dfrommi:rehaktor:master-SNAPSHOT")

import io.github.dfrommi.rehaktor.characteristics.OnCharacteristic
import io.github.dfrommi.rehaktor.core.HomekitAccessory
import io.github.dfrommi.rehaktor.core.auth.HomekitAuthService
import io.github.dfrommi.rehaktor.services.SwitchService
import io.github.hapjava.server.impl.HomekitServer
import reactor.core.publisher.DirectProcessor
import reactor.core.publisher.Flux

val loopbackProcessor = DirectProcessor.create<Boolean>()
val loopbackSink = loopbackProcessor.sink()

val fakeSwitch = HomekitAccessory(
    100, "Fake Switch", listOf(
    SwitchService(
        OnCharacteristic(Flux.from(loopbackProcessor)) {
            println("Setting fake switch to $it")
            loopbackSink.next(it)
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
