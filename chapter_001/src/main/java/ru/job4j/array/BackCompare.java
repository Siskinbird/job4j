package ru.job4j.array;
/**
 * BackCompare task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 25.02.2020
 **/

public class BackCompare {
    /**
     * @param left
     * @param right
     * @return result
     * Сравнение  эллементов массива
     **/
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

