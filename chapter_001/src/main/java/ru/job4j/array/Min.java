package ru.job4j.array;
/**
 * Min task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 05.02.2020
 **/

public class Min {
    /**
     * @param array
     * @return min
     * Поиск минимального значения
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
           if (min > array[index]) {
               min = array[index];
           }
        }
        return min;
    }
}
