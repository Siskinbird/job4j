package ru.job4j.search;

import java.util.Comparator;
/**
 * Person Comparator by address
 */
public class PersonByAddressComp implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getAddress().compareTo(o2.getAddress());
    }
}
