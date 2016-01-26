package com.example.model;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (firstname != null ? !firstname.equals(person.firstname) : person.firstname != null) return false;
        return address != null ? address.equals(person.address) : person.address == null;

    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", address=" + address +
                '}';
    }
}
