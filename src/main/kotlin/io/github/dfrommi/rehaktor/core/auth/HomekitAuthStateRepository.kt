package io.github.dfrommi.rehaktor.core.auth

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import java.io.File

interface HomekitAuthStateRepository {
    fun get(): HomekitAuthState?
    fun save(authState: HomekitAuthState)
}

class HomekitAuthStateFileRepository(private val targetFile: File) : HomekitAuthStateRepository {
    private val objectMapper = jacksonObjectMapper().findAndRegisterModules()

    override fun get() = targetFile.takeIf { it.exists() }?.let {
        objectMapper.readValue(it, HomekitAuthState::class.java)
    }

    override fun save(authState: HomekitAuthState) {
        objectMapper.writeValue(targetFile, authState)
    }
}
