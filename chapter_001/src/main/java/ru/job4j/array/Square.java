package ru.job4j.array;
/**
 * EndsWith task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 25.01.2020
 **/
public class Square {
    /**
     * @param bound
     * @return result
     * Возведение параметра в квадрат
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
       for (int x = 0; x < bound; x++) {
           rst[x] = x * x;
       }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}