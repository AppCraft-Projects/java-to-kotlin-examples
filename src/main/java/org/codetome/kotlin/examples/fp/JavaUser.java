package org.codetome.kotlin.examples.fp;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaUser {

    static class Address {
        String city;

        public String getCity() {
            return city;
        }
    }

    private final String firstName;
    private final String lastName;
    private final List<Address> addresses;

    public JavaUser(String firstName, String lastName, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    /**
     * Using the Stream API data transformation is rather easy.
     */
    public static Set<String> fetchCitiesOfUsers(List<JavaUser> users) {
        return users.stream()
                .flatMap(user -> user.addresses.stream())
                .map(JavaUser.Address::getCity)
                .collect(Collectors.toSet());
    }
}
