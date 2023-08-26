package io.github.dfrommi.hapkt.core.engine.hapjava.auth

import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

interface HomekitAuthStateRepository {
  fun get(): HomekitAuthState?
  fun save(authState: HomekitAuthState)
}

class HomekitAuthStateFileRepository(private val targetFile: File) : HomekitAuthStateRepository {
  override fun get() = targetFile.takeIf { it.exists() }?.let {file ->
    ObjectInputStream(FileInputStream(file)).use {
      it.readObject() as HomekitAuthState
    }
  }

  override fun save(authState: HomekitAuthState) {
    ObjectOutputStream(FileOutputStream(targetFile)).use {
      it.writeObject(authState)
    }
  }
}