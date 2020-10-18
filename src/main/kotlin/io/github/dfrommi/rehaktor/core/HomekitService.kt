package io.github.dfrommi.rehaktor.core

import io.github.hapjava.characteristics.Characteristic
import io.github.hapjava.services.Service

data class HomekitService(
    private val type: String,
    private val characteristics: List<Characteristic>,
    private val linkedServices: List<Service> = emptyList()
) : Service {
    override fun getType() = type
    override fun getCharacteristics() = characteristics
    override fun getLinkedServices() = linkedServices
}
