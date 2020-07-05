package ru.job4j.search;

public class Person {
    private String name;
    private String surname;
    private int phone;
    private String address;



    public Person(String name, String surname, int phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}
