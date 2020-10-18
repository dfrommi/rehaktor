// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class CameraRTPStreamManagementService(
  supportedVideoStreamConfiguration: SupportedVideoStreamConfigurationCharacteristic,
  supportedAudioStreamConfiguration: SupportedAudioStreamConfigurationCharacteristic,
  supportedRTPConfiguration: SupportedRTPConfigurationCharacteristic,
  selectedRTPStreamConfiguration: SelectedRTPStreamConfigurationCharacteristic,
  streamingStatus: StreamingStatusCharacteristic,
  setupEndpoints: SetupEndpointsCharacteristic,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "00000110-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      supportedVideoStreamConfiguration,
      supportedAudioStreamConfiguration,
      supportedRTPConfiguration,
      selectedRTPStreamConfiguration,
      streamingStatus,
      setupEndpoints,
      name
    ),
    linkedServices = linkedServices
  )
