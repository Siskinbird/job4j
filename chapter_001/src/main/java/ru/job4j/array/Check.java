package ru.job4j.array;
/**
 * Check task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 14.02.2020
 **/

public class Check {
    /**
     * @param data
     * @return result
     * Моностолбец
     **/
    public static boolean mono(boolean[] data) {


        boolean result = true;
        for (int i = 0; i < data.length - 1; i++) {
            if (data[i] != data[i + 1]) {
                return false;
            }
        }
        return result;
    }
}