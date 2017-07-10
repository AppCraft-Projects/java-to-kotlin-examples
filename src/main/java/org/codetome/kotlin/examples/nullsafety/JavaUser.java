package org.codetome.kotlin.examples.nullsafety;

import java.util.List;

/**
 * Checking for `null` values involves a lot of boolean expressions and
 * a lot of boilerplate.
 * You can work around this with the `Optional` class but what if the
 * reference to an `Optional` is `null`?
 */
public class JavaUser {

    static class Address {
        String city;
    }

    private final String firstName;
    private final String lastName;
    private final List<Address> addresses;

    public JavaUser(String firstName, String lastName, List<Address> addresses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.addresses = addresses;
    }

    public static String getFirstCity(JavaUser user) {
        if(user != null && user.addresses != null && !user.addresses.isEmpty()) {
            for(Address address : user.addresses) {
                if(address.city != null) {
                    return address.city;
                }
            }
        }
        throw new IllegalArgumentException("This User has no cities!");
    }
}
