package ru.job4j.collection;

import java.util.Objects;


/**
 /* Класс Order реализует модель даных для класса OrderConvert
 * @author Dmitry Chizhov
 * @since 16.07.20
 * @version 1.00
 */
public class Order {
    private String number;
    private String name;
    public Order(String number, String name){
        this.number = number;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(number, order.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
