package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int x = 0; x < data.length - 1; x++) {
            if (data[x] != data[x + 1]) {
                return false;
            }
        }
        return result;
    }
}