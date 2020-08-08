package ru.job4j.stream;

import java.util.Objects;

/**
 * Data model for class Profiles
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 08.08.2020
 * @version 1.10
 */
public class Address {
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return home == address.home
                &&
                apartment == address.apartment
                &&
                Objects.equals(city, address.city)
                &&
                Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, home, apartment);
    }

    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public String toString() {
        return ":::Address::: "
                + "\n"
                +
                "city: "
                + city
                + " "
                +
                ";street: "
                + street
                + " "
                +
                ";home: "
                + home
                +
                ";apartment: "
                + apartment
                + "\n";
    }
}
