package org.codetome.kotlin.examples.nullsafety

/**
 * With Kotlin you can use the null safety operator ('?') to check for
 * `null`s. The code will only run after a '?` if its left operand is not `null`.
 *
 * The `let` function creates a local binding for the object it was called upon
 * so here `it` will point to `it.city`.
 */
data class KotlinUserWithNulls(val firstName: String?,
                               val lastName: String?,
                               val addresses: List<Address> = listOf()) {

    data class Address(val city: String?)

    companion object {
        fun fetchFirstCity(user: KotlinUserWithNulls?): String? {
            user?.addresses?.forEach { it.city?.let { return it } }
            return null
        }
    }
}