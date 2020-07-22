package ru.job4j.collection;

import java.util.Objects;

/**
 /* Класс Citizen реализует модель даных для класса PassportOffice
 * @author Dmitry Chizhov
 * @since 15.07.20
 * @version 1.00
 */
public class Citizen {
    private String passport;
    private String username;
    public Citizen(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Citizen citizen = (Citizen) o;
        return Objects.equals(passport, citizen.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
