package ru.job4j.bank;

import java.util.Objects;

/**
 /* Класс User реализует модель даных для класса BankService
 * @author Dmitry Chizhov
 * @since 16.07.20
 * @version 1.00
 */
public class User {
    private String username;
    private String passport;
    public User(String passport,String username ){
        this.passport = passport;
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
