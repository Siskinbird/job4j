package ru.job4j.collection;


import java.util.Comparator;
/**
 * Ascending comparator for the User data model, by name
 */
public class UserNameAscendingComparator implements Comparator<User> {
    @Override
    public int compare(User a, User b) {
        return a.getName().compareTo(b.getName());
    }
}
