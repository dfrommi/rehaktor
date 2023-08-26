package io.github.dfrommi.hapkt.core

open class HomekitAccessory(
  val id: Int,
  val label: String,
  val services: List<HomekitService>
) {
  private val serviceByType: Map<Class<out HomekitService>, HomekitService> = services.associateBy { it.javaClass }

  fun <S: HomekitService> service(clazz: Class<S>): S {
    return serviceByType.getValue(clazz) as S
  }

  inline fun <reified S: HomekitService> service(): S {
    return service(S::class.java)
  }
}
