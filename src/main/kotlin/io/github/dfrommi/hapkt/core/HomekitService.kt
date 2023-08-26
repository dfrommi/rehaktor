package io.github.dfrommi.hapkt.core


interface HomekitService {
  val type: String
  val characteristics: List<HomekitCharacteristic<*>>
  val linkedServices: List<HomekitService>
}
