package io.github.dfrommi.rehaktor.core

import io.github.hapjava.services.Service
import java.util.concurrent.CompletableFuture

open class HomekitAccessory(
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
