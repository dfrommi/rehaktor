package io.github.dfrommi.rehaktor.generator.template

import io.github.dfrommi.rehaktor.generator.model.GenerationModel
import io.github.dfrommi.rehaktor.generator.model.ServiceGenerationModel
import java.io.File

class ServicesTemplate {
    fun generate(model: GenerationModel, packageName: String, baseDir: File) {
        val fullDir = fileFromPackage(packageName, baseDir).apply { mkdirs() }

        model.services.forEach {
            val targetFile = File(fullDir, "${it.className}.kt")
            val content = generateClass(packageName, it)
            targetFile.writeText(content)

            reformatCode(targetFile)
        }
    }

    private fun generateClass(packageName: String, service: ServiceGenerationModel) =
        """//Auto-generated. Don't modify directly
        package $packageName
        
        import io.github.hapjava.services.Service
        import io.github.dfrommi.rehaktor.core.*
        import io.github.dfrommi.rehaktor.characteristics.*
    
        class ${service.className}(
            ${formatConstructorParams(service)},
            linkedServices: List<Service> = emptyList()
        ): Service by HomekitService(
            type = "${service.uuid}",
            characteristics = listOfNotNull(
                ${service.characteristicParamNames.joinToString(",\n")}            
            ),
            linkedServices = linkedServices
        )
        """.trimIndent()

    private fun formatConstructorParams(service: ServiceGenerationModel) =
        service.constructorParameters.joinToString(",\n")
}

