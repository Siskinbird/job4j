package ru.job4j.array;

public class BackCompare {
    public static boolean compare(int[] left, int[] right) {
        boolean result = true;
        for (int index = left.length - 1; index >= 0; index--) {
            if (left[index] != right[index]) {
                result = false;
                break;
            }
        } return result;
    }
}

