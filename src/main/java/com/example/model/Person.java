package com.example.model;

import sun.applet.AppletEventMulticaster;

/**
 * Created by MMARCZYK on 2016-01-26.
 */
public class Person {
    private String firstname;
    private Address address;

    public Person() {
        address = new Address();
    }

    public Person(String firstname, Address address) {
        this.firstname = firstname;
        this.address = address;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", address=" + address +
                '}';
    }
}
