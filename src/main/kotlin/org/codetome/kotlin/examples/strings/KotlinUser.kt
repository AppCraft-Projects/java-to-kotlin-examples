package org.codetome.kotlin.examples.strings

/**
 * With Kotlin's String interpolation it is a bit simpler to
 * use variables in String literals. You can even call methods from it!
 */
class KotlinUser(val name: String, val age: Int) {

    fun toHumanReadableFormat() = "JavaUser{name='$name', age=$age}"

    fun toHumanReadableFormatWithMethodCall() = "JavaUser{name='${name.capitalize()}', age=$age}"
}