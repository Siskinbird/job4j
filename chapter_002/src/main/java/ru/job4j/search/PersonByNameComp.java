package ru.job4j.search;

import java.util.Comparator;
/**
 * Person Comparator by name
 */
public class PersonByNameComp implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
