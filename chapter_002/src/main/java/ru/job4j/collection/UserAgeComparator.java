package ru.job4j.collection;

import java.util.Comparator;

/**
 * Comparator for the User data model, by age
 */
public class UserAgeComparator implements Comparator<User> {
    public int compare(User a, User b) {
        return Integer.compare(a.getAge(), b.getAge());

    }
}