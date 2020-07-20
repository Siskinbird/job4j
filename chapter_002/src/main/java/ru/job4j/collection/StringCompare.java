package ru.job4j.collection;


import java.util.Comparator;

/**
 * Comparator for array of strings
 */

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        return Integer.compare(left.compareTo(right), 0);
    }
}
