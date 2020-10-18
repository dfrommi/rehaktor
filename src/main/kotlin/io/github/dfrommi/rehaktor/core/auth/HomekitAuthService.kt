package io.github.dfrommi.rehaktor.core.auth

import io.github.hapjava.server.HomekitAuthInfo
import java.io.File

class HomekitAuthService(
    private val authStateRepository: HomekitAuthStateRepository = HomekitAuthStateFileRepository(File("homekit.json")),
    private val initialAuthState: HomekitAuthState = HomekitAuthState(),
) : HomekitAuthInfo {
    private val authState by lazy {
        authStateRepository.get() ?: initialAuthState
    }

    override fun getPin() = authState.pin
    override fun getMac() = authState.mac
    override fun getPrivateKey() = authState.privateKey
    override fun getSalt() = authState.salt
    override fun getUserPublicKey(username: String) = authState.userKeyMap[username]

    override fun createUser(username: String, publicKey: ByteArray) {
        authState.userKeyMap[username] = publicKey
        authStateRepository.save(authState)
    }

    override fun removeUser(username: String) {
        authState.userKeyMap.remove(username)
        authStateRepository.save(authState)
    }
}
