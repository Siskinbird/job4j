package ru.job4j.array;
/**
 * FindLoop task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 04.03.2020
 **/

public class FindLoop {
    /**
     * @param data
     * @param el
     * @return rst
     * Индекс элемента
     */
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    /**
     * @param data
     * @param el
     * @param start
     * @param finish
     * @return result
     * Поиск индекса в заданном диапазоне
     */
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int i = start; i < finish; i++) {
            if (data[i] == el) {
                return i;
            }
        } return rst;
    }
    /**
     * @param data
     * @return rst
     * Поиск индекса минимального значения в заданном диапазоне
     */
    public static int[] sort(int[] data) {
            for (int i = 0; i < data.length; i++) {
            int temp = data[i];
            int min = MinDiapason.findMin(data, i, data.length - 1);
        int index = FindLoop.indexOf(data, min, 0, data.length);
        data[i] = data[index];
        data[index] = temp;
        }
        return data;
    }
}







