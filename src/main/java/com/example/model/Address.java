package com.example.model;

/**
 * Created by MMARCZYK on 2016-01-26.
 */
public class Address {
    private String city;
    private int street;

    public Address() {
    }

    public Address(String city, int street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getStreet() {
        return street;
    }

    public void setStreet(int street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street=" + street +
                '}';
    }
}
