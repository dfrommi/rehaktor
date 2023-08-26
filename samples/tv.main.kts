#!/usr/bin/env kotlin

@file:Repository("https://jitpack.io")
@file:DependsOn("com.github.dfrommi:hap-kt:master-SNAPSHOT")

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.HomekitAccessory
import io.github.dfrommi.rehaktor.core.ObservableValue
import io.github.dfrommi.rehaktor.core.auth.HomekitAuthService
import io.github.dfrommi.rehaktor.services.*
import io.github.hapjava.server.impl.HomekitServer

val tv = HomekitAccessory(
    200, "Television", listOf(
        TelevisionService(
            active = ActiveCharacteristic(ObservableValue(ActiveCharacteristic.Enum.ACTIVE)) { println("Active = $it") },
            activeIdentifier = ActiveIdentifierCharacteristic(ObservableValue(1)) { println("Active input = $it") },
            configuredName = ConfiguredNameCharacteristic("My TV"),
            sleepDiscoveryMode = SleepDiscoveryModeCharacteristic(SleepDiscoveryModeCharacteristic.Enum.ALWAYS_DISCOVERABLE),
            linkedServices = listOf(
                InputSourceService(
                    configuredName = ConfiguredNameCharacteristic("Hdmi 1"),
                    inputSourceType = InputSourceTypeCharacteristic(InputSourceTypeCharacteristic.Enum.HDMI),
                    isConfigured = IsConfiguredCharacteristic(IsConfiguredCharacteristic.Enum.CONFIGURED),
                    currentVisibilityState = CurrentVisibilityStateCharacteristic(CurrentVisibilityStateCharacteristic.Enum.SHOWN),
                    identifier = IdentifierCharacteristic(1)
                ),
                InputSourceService(
                    configuredName = ConfiguredNameCharacteristic("Netflix"),
                    inputSourceType = InputSourceTypeCharacteristic(InputSourceTypeCharacteristic.Enum.APPLICATION),
                    isConfigured = IsConfiguredCharacteristic(IsConfiguredCharacteristic.Enum.CONFIGURED),
                    currentVisibilityState = CurrentVisibilityStateCharacteristic(CurrentVisibilityStateCharacteristic.Enum.SHOWN),
                    identifier = IdentifierCharacteristic(2)
                )
            )
        ),
        TelevisionSpeakerService(
            active = ActiveCharacteristic(ObservableValue(ActiveCharacteristic.Enum.ACTIVE)) {},
            mute = MuteCharacteristic(ObservableValue(false)) { println("Mute = $it") },
            volume = VolumeCharacteristic(ObservableValue(50)) { println("Volume = $it") },
            volumeControlType = VolumeControlTypeCharacteristic(VolumeControlTypeCharacteristic.Enum.ABSOLUTE)
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
