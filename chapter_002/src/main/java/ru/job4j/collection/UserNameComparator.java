package ru.job4j.collection;

import java.util.Comparator;

/**
 * Comparator for the User data model, by name
 */
public class UserNameComparator implements Comparator<User> {
    public int compare(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}
