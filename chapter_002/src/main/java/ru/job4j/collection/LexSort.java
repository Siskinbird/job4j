package ru.job4j.collection;

import java.util.Comparator;

/**
 * Implementation of the LexSort comparator. It compares the number, not the entire string.
 */

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String [] numLeft = left.split(". ", 2);
        String [] numRight = right.split(". ", 2);
        int x = Integer.parseInt(numLeft[0]);
        int y = Integer.parseInt(numRight[0]);
        return Integer.compare(x, y);
    }
}

