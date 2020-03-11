package ru.job4j.array;
/**
 * EndsWith task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 11.02.2020
 */

public class MinDiapason {
    /**
     * @param array
     * @param start
     * @param finish
     * @return result
     * Поиск минимума в дивпазоне значений
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
           if (min > array[index]) {
            min = array[index];
           }
      }
        return min;
    }
}
