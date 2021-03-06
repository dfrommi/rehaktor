package io.github.dfrommi.rehaktor.generator

import com.squareup.kotlinpoet.FileSpec
import io.github.dfrommi.rehaktor.generator.metadata.HomekitMetadata
import io.github.dfrommi.rehaktor.generator.template.CharacteristicClassBuilder
import io.github.dfrommi.rehaktor.generator.template.ServiceClassBuilder
import io.github.dfrommi.rehaktor.generator.template.reformatCode
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

    val characteristicByUuid = metadata.characteristics.map {
        it.uuid to CharacteristicClassBuilder("io.github.dfrommi.rehaktor.characteristics", it).build()
    }.toMap()

    val services = metadata.services.map {
        ServiceClassBuilder("io.github.dfrommi.rehaktor.services", it, characteristicByUuid).build()
    }

    (services + characteristicByUuid.values).forEach {
        FileSpec.builder(it.name.packageName, it.name.simpleName)
            .addComment("Auto-generated. Don't modify directly")
            .addType(it.type)
            .build()
            .writeTo(baseDir)
    }

    File(baseDir, "io/github/dfrommi/rehaktor/characteristics").listFiles()?.forEach {
        reformatCode(it)
    }

    File(baseDir, "io/github/dfrommi/rehaktor/services").listFiles()?.forEach {
        reformatCode(it)
    }
}
