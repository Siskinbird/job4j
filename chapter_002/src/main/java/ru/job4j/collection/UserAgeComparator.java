package ru.job4j.collection;

import java.util.Comparator;

/**
 * Comparator for the User data model, by age
 */
public class UserAgeComparator implements Comparator<User> {
    public int compare(User a, User b) {
        if (a.getAge() > b.getAge()) {
            return 1;
        } else {
            if (a.getAge() < b.getAge()) {
                return -1;
            } else {
                return 0;
            }
        }

    }
}