package ru.job4j.array;
/**
 * FindLoop task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 04.03.2020
 **/


public class Matrix {
    /**
     * @param size
     * @return result
     * Таблица умножения, создание 2х мерного массива.
     **/
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = (i + 1) * (j + 1);
                System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        } return table;
    }
}
