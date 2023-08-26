package io.github.dfrommi.hapkt.core.engine.hapjava.adapter

import io.github.dfrommi.hapkt.core.HomekitAccessory
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.hapjava.services.Service
import java.util.concurrent.CompletableFuture

fun HomekitAccessory.toHapJava() = HapJavaAccessoryAdapter(
  id = id,
  label = label,
  services = services.map(HomekitService::toHapJava)
)

open class HapJavaAccessoryAdapter(
  private val id: Int,
  private val label: String,
  private val services: List<Service>
) : io.github.hapjava.accessories.HomekitAccessory {
  override fun getId() = id
  override fun getName() = CompletableFuture.completedFuture(label)

  override fun getModel() = CompletableFuture.completedFuture(this::class.simpleName)
  override fun getSerialNumber() = CompletableFuture.completedFuture("$id")
  override fun getManufacturer() = CompletableFuture.completedFuture("HAP-kt")
  override fun getFirmwareRevision() = CompletableFuture.completedFuture("A")

  override fun identify() = println("HOMEKIT IDENTIFY: ${javaClass.simpleName} - $label ($id)")

  override fun getServices() = services
}
