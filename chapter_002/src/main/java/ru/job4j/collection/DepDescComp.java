package ru.job4j.collection;

import java.util.*;

/**
 * Descending comparator for class Departments
 */

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] first = o1.split("/");
        String[] second = o2.split("/");
        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            if (second[i].compareTo(first[i]) != 0) {
                return first[i].compareTo(second[i]);
            }
        }
        if (Arrays.equals(first, second)) {
            return 0;
        } else {
            return -1;
        }
    }
}

