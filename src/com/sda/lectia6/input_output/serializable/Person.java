package com.sda.lectia6.input_output.serializable;

import java.io.Serializable;

public class Person implements Serializable {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return "Person{firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName + '\'' + '}';
    }
}

