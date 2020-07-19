package ru.job4j.collection;

import java.util.Comparator;
/**
 * Descending comparator for the User data model, by name
 */
public class UserNameDescendingComparator implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return b.getName().compareTo(a.getName());
    }

}
