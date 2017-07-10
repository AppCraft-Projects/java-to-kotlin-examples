package org.codetome.kotlin.examples.fp

data class KotlinUser(val firstName: String,
                      val lastName: String,
                      val addresses: List<Address> = listOf()) {

    data class Address(val city: String)

    companion object {

        /**
         * The differences from Java are rather subtle here:
         * - There is no explicit conversion to streams since all Kotlin
         *   collections support it out of the box
         * - Not having to pass a lambda to `flatMap` here is a direct
         *   consequence of this
         * - Collecting the result is also automatic (no need for
         *   `Collectors.to*` method calls. We only had to use `toSet`
         *   here because we want to return a `Set`
         */
        fun fetchCitiesOfUsers(users: List<KotlinUser>) = users
                .flatMap(KotlinUser::addresses)
                .map(Address::city)
                .toSet()
    }

}