// Auto-generated. Don't modify directly
package io.github.dfrommi.hapkt.services

import io.github.dfrommi.hapkt.characteristics.AirQuality
import io.github.dfrommi.hapkt.characteristics.CarbonDioxideLevel
import io.github.dfrommi.hapkt.characteristics.CarbonMonoxideLevel
import io.github.dfrommi.hapkt.characteristics.Name
import io.github.dfrommi.hapkt.characteristics.NitrogenDioxideDensity
import io.github.dfrommi.hapkt.characteristics.OzoneDensity
import io.github.dfrommi.hapkt.characteristics.PM10Density
import io.github.dfrommi.hapkt.characteristics.PM25Density
import io.github.dfrommi.hapkt.characteristics.StatusActive
import io.github.dfrommi.hapkt.characteristics.StatusFault
import io.github.dfrommi.hapkt.characteristics.StatusLowBattery
import io.github.dfrommi.hapkt.characteristics.StatusTampered
import io.github.dfrommi.hapkt.characteristics.SulphurDioxideDensity
import io.github.dfrommi.hapkt.characteristics.VOCDensity
import io.github.dfrommi.hapkt.core.HomekitCharacteristic
import io.github.dfrommi.hapkt.core.HomekitService
import io.github.dfrommi.hapkt.core.utils.truncated
import kotlin.String
import kotlin.collections.List

public class AirQualitySensor(
  public val airQuality: AirQuality,
  public val statusActive: StatusActive? = null,
  public val statusFault: StatusFault? = null,
  public val statusTampered: StatusTampered? = null,
  public val statusLowBattery: StatusLowBattery? = null,
  public val name: Name? = null,
  public val ozoneDensity: OzoneDensity? = null,
  public val nitrogenDioxideDensity: NitrogenDioxideDensity? = null,
  public val sulphurDioxideDensity: SulphurDioxideDensity? = null,
  public val pM25Density: PM25Density? = null,
  public val pM10Density: PM10Density? = null,
  public val vOCDensity: VOCDensity? = null,
  public val carbonMonoxideLevel: CarbonMonoxideLevel? = null,
  public val carbonDioxideLevel: CarbonDioxideLevel? = null,
  public override val linkedServices: List<HomekitService> = emptyList(),
) : HomekitService {
  public override val type: String = "0000008D-0000-1000-8000-0026BB765291"

  public override val characteristics: List<HomekitCharacteristic<*>> = listOfNotNull(
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
  )

}
