package io.github.dfrommi.rehaktor.generator.template

import io.github.dfrommi.rehaktor.generator.model.CharacteristicGenerationModel
import io.github.dfrommi.rehaktor.generator.model.GenerationModel
import java.io.File

class CharacteristicsTemplate {
    fun generate(model: GenerationModel, packageName: String, baseDir: File) {
        val fullDir = fileFromPackage(packageName, baseDir).apply { mkdirs() }

        model.characteristics.forEach {
            val targetFile = File(fullDir, "${it.className}.kt")
            val content = generateClass(packageName, it)
            targetFile.writeText(content)

            reformatCode(targetFile)
        }
    }

    private fun generateClass(packageName: String, characteristic: CharacteristicGenerationModel) =
        """//Auto-generated. Don't modify directly
        package $packageName
        
        import io.github.dfrommi.rehaktor.core.*
        import reactor.core.publisher.Flux

        class ${characteristic.className}(${formatConstructorParams(characteristic)}) : ${characteristic.baseClass}(
            ${formatBaseClassArguments(characteristic)}
        ) {${generateOptionalEnum(characteristic)}}
        """.trimIndent()

    private fun generateOptionalEnum(characteristic: CharacteristicGenerationModel) =
        characteristic.enumValues?.let { e ->
            """
            enum class Enum {
                ${e.joinToString(",\n")};
            """.trimIndent() +
                (if (characteristic.enumValues.size == 2)
                    """
                        fun toBoolean() = this == ${characteristic.enumValues[1]}
                
                        companion object {
                            fun from(v: Boolean) = if (v) ${characteristic.enumValues[1]} else ${characteristic.enumValues[0]}
                        }
                        """.trimIndent()
                else "") +
                "}"
        } ?: ""

    private fun formatConstructorParams(characteristic: CharacteristicGenerationModel) =
        characteristic.constructorParameters.joinToString(", ") { "${it.first}: ${it.second}" }

    private fun formatBaseClassArguments(characteristic: CharacteristicGenerationModel) =
        characteristic.baseClassArguments.joinToString(",\n") {
            "${it.first} = " + when (it.first) {
                "type", "description" -> "\"${it.second}\""
                else -> it.second
            }
        }
}

