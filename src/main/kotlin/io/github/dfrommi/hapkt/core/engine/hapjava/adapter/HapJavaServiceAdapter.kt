package io.github.dfrommi.hapkt.core.engine.hapjava.adapter

import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.hapjava.characteristics.Characteristic
import io.github.hapjava.services.Service

fun HomekitService.toHapJava(): HapJavaServiceAdapter = HapJavaServiceAdapter(
  type = type,
  characteristics = characteristics.map(HomekitCharacteristic<*>::toHapJava),
  linkedServices = linkedServices.map { it.toHapJava() }
)

data class HapJavaServiceAdapter(
  private val type: String,
  private val characteristics: List<Characteristic>,
  private val linkedServices: List<Service> = emptyList()
) : Service {
  private val aggregatedLinkedServices = linkedServices.toMutableList()

  override fun getType() = type
  override fun getCharacteristics() = characteristics
  override fun getLinkedServices() = aggregatedLinkedServices
  override fun addLinkedService(service: Service) {
    aggregatedLinkedServices.add(service)
  }
}
