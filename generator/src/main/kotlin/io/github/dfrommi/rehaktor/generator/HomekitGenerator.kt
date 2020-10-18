package io.github.dfrommi.rehaktor.generator

import io.github.dfrommi.rehaktor.generator.metadata.HomekitMetadata
import io.github.dfrommi.rehaktor.generator.model.GenerationModel
import io.github.dfrommi.rehaktor.generator.template.CharacteristicsTemplate
import io.github.dfrommi.rehaktor.generator.template.ServicesTemplate
import java.io.File

/*
 * Get Homekit Accessory Generator (HAS):
 *  - Additional tools for XCode at https://developer.apple.com/download/more/?=for%20Xcode
 *  - Get the file HomeKit Accessory Simulator.app/Contents/Frameworks/HAPAccessoryKit.framework/Versions/A/Resources/default.metadata.plist
 *  - Copy to project resources
 *  - Convert to JSON with `plutil -convert json default.metadata.plist`
 *  - run main method to generate code
 */

// For TV metadata see
// See https://github.com/homebridge/HAP-NodeJS/blob/master/src/lib/gen/HomeKit-TV.ts
// and https://github.com/brutella/hc/blob/master/gen/metadata.json
fun main(args: Array<String>) {
    require(args.count() == 1) { "Base directory parameter missing" }

    val baseDir = File(args.first())
    if (!baseDir.exists()) {
        baseDir.mkdirs()
    }

    val metadata = HomekitMetadata.fromResources("/default.metadata.json", "/tv.metadata.json")

    val generationModel = GenerationModel(metadata)

    CharacteristicsTemplate().generate(generationModel, "io.github.dfrommi.rehaktor.characteristics", baseDir)
    ServicesTemplate().generate(generationModel, "io.github.dfrommi.rehaktor.services", baseDir)
}
