package com.example.model;

/**
 * Created by MMARCZYK on 2016-01-26.
 */
public class Address {
    private String city;

    public Address() {
        city = "";
    }

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        return city != null ? city.equals(address.city) : address.city == null;

    }

    @Override
    public int hashCode() {
        return city != null ? city.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                '}';
    }
}
