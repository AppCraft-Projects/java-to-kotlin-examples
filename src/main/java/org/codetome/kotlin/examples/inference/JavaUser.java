package org.codetome.kotlin.examples.inference;

import java.util.List;

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

    public Address getFirstAddress() {
        Address firstAddress = addresses.get(0);
        return firstAddress;
    }
}
