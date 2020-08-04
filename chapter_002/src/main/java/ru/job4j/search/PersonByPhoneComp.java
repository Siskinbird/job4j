package ru.job4j.search;

import java.util.Comparator;
/**
 * Person Comparator by phone
 */
public class PersonByPhoneComp implements Comparator<Person> {
    public int compare(Person o1, Person o2) {
        return o1.getPhone().compareTo(o2.getPhone());
    }
}
