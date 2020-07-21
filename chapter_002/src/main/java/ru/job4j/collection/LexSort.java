package ru.job4j.collection;

import java.util.Comparator;

/**
 * Implementation of the LexSort comparator. It compares the number, not the entire string.
 */

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (String numLeft : left.split(". ", 2)) {
            int x = Integer.parseInt(numLeft);
            for (String numRight : right.split(". ", 2)) {
                int y = Integer.parseInt(numRight);
                if (x != y) {
                    return Integer.compare(x, y);
                }
            }
        } return 0;
    }
}

