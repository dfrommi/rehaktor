#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:DependsOn("com.github.dfrommi:rehaktor:master-SNAPSHOT")

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.HomekitAccessory
import io.github.dfrommi.rehaktor.core.auth.HomekitAuthService
import io.github.dfrommi.rehaktor.services.*
import io.github.hapjava.server.impl.HomekitServer
import reactor.core.publisher.Flux

val tv = HomekitAccessory(
    200, "Television", listOf(
        TelevisionService(
            active = ActiveCharacteristic(Flux.just(ActiveCharacteristic.Enum.ACTIVE)) { println("Active = $it")},
            activeIdentifier = ActiveIdentifierCharacteristic(Flux.just(1)) { println("Active input = $it") },
            configuredName = ConfiguredNameCharacteristic(Flux.just("My TV")) {},
            sleepDiscoveryMode = SleepDiscoveryModeCharacteristic(Flux.just(SleepDiscoveryModeCharacteristic.Enum.ALWAYS_DISCOVERABLE)),
            linkedServices = listOf(
                InputSourceService(
                    configuredName = ConfiguredNameCharacteristic(Flux.just("Hdmi 1")) {},
                    inputSourceType = InputSourceTypeCharacteristic(Flux.just(InputSourceTypeCharacteristic.Enum.HDMI)),
                    isConfigured = IsConfiguredCharacteristic(Flux.just(IsConfiguredCharacteristic.Enum.CONFIGURED)) {},
                    currentVisibilityState = CurrentVisibilityStateCharacteristic(Flux.just(CurrentVisibilityStateCharacteristic.Enum.SHOWN)),
                    identifier = IdentifierCharacteristic(1)
                ),
                InputSourceService(
                    configuredName = ConfiguredNameCharacteristic(Flux.just("Netflix")) {},
                    inputSourceType = InputSourceTypeCharacteristic(Flux.just(InputSourceTypeCharacteristic.Enum.APPLICATION)),
                    isConfigured = IsConfiguredCharacteristic(Flux.just(IsConfiguredCharacteristic.Enum.CONFIGURED)) {},
                    currentVisibilityState = CurrentVisibilityStateCharacteristic(Flux.just(CurrentVisibilityStateCharacteristic.Enum.SHOWN)),
                    identifier = IdentifierCharacteristic(2)
                )
            )
        ),
        TelevisionSpeakerService(
            active = ActiveCharacteristic(Flux.just(ActiveCharacteristic.Enum.ACTIVE)) {},
            mute = MuteCharacteristic(Flux.just(false)) { println("Mute = $it") },
            volume = VolumeCharacteristic(Flux.just(50)) { println("Volume = $it") },
            volumeControlType = VolumeControlTypeCharacteristic(Flux.just(VolumeControlTypeCharacteristic.Enum.ABSOLUTE))
        )
    )
)

val authInfoService = HomekitAuthService()
val bridge = HomekitServer(9123).createBridge(
    authInfoService, "Test Bridge", "Smart Home", "B2", "42", "A", "B"
)

bridge.addAccessory(tv)

println("===============")
println("PIN: ${authInfoService.pin}")
println("===============")

bridge.start()
