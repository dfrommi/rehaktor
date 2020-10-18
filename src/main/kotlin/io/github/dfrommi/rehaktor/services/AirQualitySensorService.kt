// Auto-generated. Don't modify directly
package io.github.dfrommi.rehaktor.services

import io.github.dfrommi.rehaktor.characteristics.*
import io.github.dfrommi.rehaktor.core.*
import io.github.hapjava.services.Service

class AirQualitySensorService(
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
) : Service by HomekitService(
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
