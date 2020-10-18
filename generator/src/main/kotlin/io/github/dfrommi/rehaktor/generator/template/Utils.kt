package io.github.dfrommi.rehaktor.generator.template

import java.io.File

fun reformatCode(file: File) {
    com.pinterest.ktlint.main(arrayOf(
        "--disabled_rules", "no-wildcard-imports",
        "-F", file.absolutePath)
    )
}

fun fileFromPackage(packageName: String, baseDir: File) = File(baseDir, packageName.replace(".", "/"))
