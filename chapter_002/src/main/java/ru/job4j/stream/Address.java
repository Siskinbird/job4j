package ru.job4j.stream;

/**
 * Data model for class Profiles
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 08.08.2020
 * @version 1.00
 */
public class Address {
    private String city;
    private String street;
    private int home;
    private int apartment;

    public Address(String city, String street, int home, int apartment){
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
        return "Address{"
                +
                "city:'"
                + city
                + '\''
                +
                ", street:'"
                + street
                + '\''
                +
                ", home:"
                + home
                +
                ", apartment:"
                + apartment
                +
                '}';
    }
}
