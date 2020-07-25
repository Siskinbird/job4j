package ru.job4j.collection;

import java.util.*;

/**
 * Class for checking strings for identity
 */
public class FreezeStr {
    public static boolean eq(String left, String right) {
        String[] leftCh = left.split("");
        String[] rightCh = right.split("");
        List<String> sortedLeft = Arrays.asList(leftCh);
        List<String> sortedRight = Arrays.asList(rightCh);
        Collections.sort(sortedLeft);
        Collections.sort(sortedRight);
        return sortedLeft.equals(sortedRight);
    }
}

