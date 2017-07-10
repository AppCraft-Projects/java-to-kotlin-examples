package org.codetome.kotlin.examples.exceptions

import java.io.File

class KotlinLineLoader {

    /**
     * Kotlin does away with checked exceptions *and*
     * it also adds commonly used functionality to existing
     * java classes (like `readLines` here).
     */
    fun loadLines(path: String) = File(path).readLines()
}