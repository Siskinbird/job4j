package ru.job4j.search;

import java.util.Comparator;
/**
 * Person Comparator by surname
 */
public class PersonBySurnameComp implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
