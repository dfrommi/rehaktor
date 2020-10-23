// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.AirQualityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CarbonDioxideLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.CarbonMonoxideLevelCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NameCharacteristic
import io.github.dfrommi.rehaktor.characteristics.NitrogenDioxideDensityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.OzoneDensityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.PM10DensityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.PM25DensityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusActiveCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusFaultCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusLowBatteryCharacteristic
import io.github.dfrommi.rehaktor.characteristics.StatusTamperedCharacteristic
import io.github.dfrommi.rehaktor.characteristics.SulphurDioxideDensityCharacteristic
import io.github.dfrommi.rehaktor.characteristics.VOCDensityCharacteristic
import io.github.hapjava.services.Service
import kotlin.collections.List

public class AirQualitySensorService(
  airQuality: AirQualityCharacteristic,
  statusActive: StatusActiveCharacteristic? = null,
  statusFault: StatusFaultCharacteristic? = null,
  statusTampered: StatusTamperedCharacteristic? = null,
  statusLowBattery: StatusLowBatteryCharacteristic? = null,
  name: NameCharacteristic? = null,
  ozoneDensity: OzoneDensityCharacteristic? = null,
  nitrogenDioxideDensity: NitrogenDioxideDensityCharacteristic? = null,
  sulphurDioxideDensity: SulphurDioxideDensityCharacteristic? = null,
  pM25Density: PM25DensityCharacteristic? = null,
  pM10Density: PM10DensityCharacteristic? = null,
  vOCDensity: VOCDensityCharacteristic? = null,
  carbonMonoxideLevel: CarbonMonoxideLevelCharacteristic? = null,
  carbonDioxideLevel: CarbonDioxideLevelCharacteristic? = null,
  linkedServices: List<Service> = emptyList()
) : Service by io.github.dfrommi.rehaktor.core.HomekitService(
    type = "0000008D-0000-1000-8000-0026BB765291",
    characteristics = listOfNotNull(
      airQuality,
      statusActive,
      statusFault,
      statusTampered,
      statusLowBattery,
      name,
      ozoneDensity,
      nitrogenDioxideDensity,
      sulphurDioxideDensity,
      pM25Density,
      pM10Density,
      vOCDensity,
      carbonMonoxideLevel,
      carbonDioxideLevel
    ),
    linkedServices = linkedServices
  )
