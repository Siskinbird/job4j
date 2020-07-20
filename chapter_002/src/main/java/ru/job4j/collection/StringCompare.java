package ru.job4j.collection;


import java.util.Comparator;

/**
 * Comparator for array of strings
 */

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < Math.min(left.length(), right.length()); i++) {
            char o1 = left.charAt(i);
            char o2 = right.charAt(i);
            if (o1 != o2) {
                return o1 - o2;
            }
        }
        return left.length() - right.length();
    }
}