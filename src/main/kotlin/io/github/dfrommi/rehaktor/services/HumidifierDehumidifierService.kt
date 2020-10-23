// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.ActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentHumidifierDehumidifierStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CurrentRelativeHumidityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.LockPhysicalControlsCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RelativeHumidityDehumidifierThresholdCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RelativeHumidityHumidifierThresholdCharacteristic
import io.github.dfrommi.rehaktor.characteristics.RotationSpeedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SwingModeCharacteristic
import io.github.dfrommi.rehaktor.characteristics.TargetHumidifierDehumidifierStateCharacteristic
import io.github.dfrommi.rehaktor.characteristics.WaterLevelCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class HumidifierDehumidifierService(
  currentRelativeHumidity: CurrentRelativeHumidityCharacteristic,
  currentHumidifierDehumidifierState: CurrentHumidifierDehumidifierStateCharacteristic,
  targetHumidifierDehumidifierState: TargetHumidifierDehumidifierStateCharacteristic,
  active: ActiveCharacteristic,
  lockPhysicalControls: LockPhysicalControlsCharacteristic? = null,
  name: NameCharacteristic? = null,
  swingMode: SwingModeCharacteristic? = null,
  waterLevel: WaterLevelCharacteristic? = null,
  relativeHumidityDehumidifierThreshold: RelativeHumidityDehumidifierThresholdCharacteristic? =
    null,
  relativeHumidityHumidifierThreshold: RelativeHumidityHumidifierThresholdCharacteristic? = null,
  rotationSpeed: RotationSpeedCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
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
