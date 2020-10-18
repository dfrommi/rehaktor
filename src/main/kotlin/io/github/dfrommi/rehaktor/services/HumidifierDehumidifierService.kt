// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class HumidifierDehumidifierService(
  currentRelativeHumidity: CurrentRelativeHumidityCharacteristic,
  currentHumidifierDehumidifierState: CurrentHumidifierDehumidifierStateCharacteristic,
  targetHumidifierDehumidifierState: TargetHumidifierDehumidifierStateCharacteristic,
  active: ActiveCharacteristic,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  waterLevel: WaterLevelCharacteristic? = null,
  relativeHumidityDehumidifierThreshold: RelativeHumidityDehumidifierThresholdCharacteristic? = null,
  relativeHumidityHumidifierThreshold: RelativeHumidityHumidifierThresholdCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by HomekitService(
    type = "000000BD-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      currentRelativeHumidity,
      currentHumidifierDehumidifierState,
      targetHumidifierDehumidifierState,
      active,
      lockPhysicalControls,
      name,
      swingMode,
      waterLevel,
      relativeHumidityDehumidifierThreshold,
      relativeHumidityHumidifierThreshold,
      rotationSpeed
    ),
    linkedServices = linkedServices
  )
