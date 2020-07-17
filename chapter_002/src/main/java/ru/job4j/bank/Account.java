package ru.job4j.bank;

import java.util.Objects;

/**
 /* Класс Account реализует модель даных для класса BankService
 * @author Dmitry Chizhov
 * @since 16.07.20
 * @version 1.00
 */
public class Account {
    private String requisite;
    private double balance;

    public String getRequisite() {
        return requisite;
    }

    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String requisite, double balance){
        this.requisite = requisite;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
