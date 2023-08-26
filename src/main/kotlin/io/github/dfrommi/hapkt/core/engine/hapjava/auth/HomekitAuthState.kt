package io.github.dfrommi.hapkt.core.engine.hapjava.auth

import io.github.hapjava.server.impl.HomekitServer
import java.io.Serializable
import java.math.BigInteger
import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

data class HomekitAuthState(
  val pin: String = "031-45-154",
  val mac: String = HomekitServer.generateMac(),
  val salt: BigInteger = HomekitServer.generateSalt(),
  val privateKey: ByteArray = HomekitServer.generateKey(),
  val userKeyMap: ConcurrentMap<String, ByteArray> = ConcurrentHashMap()
): Serializable
