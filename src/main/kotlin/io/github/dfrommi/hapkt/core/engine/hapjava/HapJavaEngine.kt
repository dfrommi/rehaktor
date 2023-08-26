package io.github.dfrommi.hapkt.core.engine.hapjava

import io.github.dfrommi.hapkt.core.HomekitAccessory
import io.github.dfrommi.hapkt.core.engine.hapjava.adapter.toHapJava
import io.github.dfrommi.hapkt.core.engine.hapjava.auth.HomekitAuthService
import io.github.dfrommi.hapkt.core.engine.hapjava.auth.HomekitAuthState
import io.github.dfrommi.hapkt.core.engine.hapjava.auth.HomekitAuthStateFileRepository
import io.github.dfrommi.hapkt.core.engine.hapjava.auth.HomekitAuthStateRepository
import io.github.hapjava.server.HomekitAccessoryCategories
import io.github.hapjava.server.impl.HomekitRoot
import io.github.hapjava.server.impl.HomekitServer
import java.io.File
import java.net.InetAddress

class HapJavaEngine(
  label: String,
  manufacturer: String = "HAP-kt",
  model: String = "B2",
  serialNumber: String = "42",
  firmwareRevision: String = "A",
  hardwareRevision: String = "B",
  accessories: Set<HomekitAccessory>,
  port: Int = 9123,
  inetAddress: InetAddress = InetAddress.getLocalHost(),
  authStateRepository: HomekitAuthStateRepository = HomekitAuthStateFileRepository(File("hapjava.config")),
  initialAuthState: HomekitAuthState = HomekitAuthState(),
) {
  private val bridge: HomekitRoot
  val pin: String

  init {
    val authInfoService = HomekitAuthService(authStateRepository, initialAuthState)
    pin = authInfoService.pin

    bridge = HomekitServer(inetAddress, port).createBridge(
      authInfoService,
      label,
      HomekitAccessoryCategories.BRIDGES,
      manufacturer,
      model,
      serialNumber,
      firmwareRevision,
      hardwareRevision
    )

    accessories.forEach {
      bridge.addAccessory(it.toHapJava())
    }
  }

  fun start() {
    bridge.start()
  }

  fun stop() {
    bridge.stop()
  }
}
