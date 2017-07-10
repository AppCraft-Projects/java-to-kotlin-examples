package org.codetome.kotlin.examples.inference

data class KotlinUser(val firstName: String,
                      val lastName: String,
                      val addresses: List<Address> = listOf()) {

    data class Address(val city: String)

    /**
     * This is the same as in `JavaUser`.
     */
    fun getFirstAddressNoInference(): Address {
        val firstAddress: Address = addresses.first()
        return firstAddress
    }

    /**
     * Here the type of `firstAddress` is inferred from the context.
     */
    fun getFirstAddressInferred(): Address {
        val firstAddress = addresses.first()
        return firstAddress
    }

    /**
     * Here the return type is inferred. Note that
     * if a method consists of only one statement
     * you can omit the curly braces.
     */
    fun getFirstAddress() = addresses.first()

}