package io.github.dfrommi.rehaktor.generator.template

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeSpec
import java.io.File

fun reformatCode(file: File) {
    com.pinterest.ktlint.main(arrayOf("-F", file.absolutePath))
}

data class ClassSpec(
    val name: ClassName,
    val type: TypeSpec
)
