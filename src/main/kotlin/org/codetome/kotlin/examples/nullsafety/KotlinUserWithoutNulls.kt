package org.codetome.kotlin.examples.nullsafety

/**
 * If there are no `null`s involved (no '?'s present)
 * it all becomes a lot more simpler.
 */
data class KotlinUserWithoutNulls(val firstName: String,
                                  val lastName: String,
                                  val addresses: List<Address> = listOf()) {

    data class Address(val city: String)

    companion object {
        fun fetchFirstCity(user: KotlinUserWithNulls) = user.addresses.first().city
    }
}