// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SelectedRTPStreamConfigurationCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SetupEndpointsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StreamingStatusCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SupportedAudioStreamConfigurationCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SupportedRTPConfigurationCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SupportedVideoStreamConfigurationCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class CameraRTPStreamManagementService(
  supportedVideoStreamConfiguration: SupportedVideoStreamConfigurationCharacteristic,
  supportedAudioStreamConfiguration: SupportedAudioStreamConfigurationCharacteristic,
  supportedRTPConfiguration: SupportedRTPConfigurationCharacteristic,
  selectedRTPStreamConfiguration: SelectedRTPStreamConfigurationCharacteristic,
  streamingStatus: StreamingStatusCharacteristic,
  setupEndpoints: SetupEndpointsCharacteristic,
  name: NameCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
