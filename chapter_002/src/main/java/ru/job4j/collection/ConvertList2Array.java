package ru.job4j.collection;

import java.util.List;

/**
 * Конвертация списка в двухмерный массив
 */

public class ConvertList2Array {

    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            if (cell < cells) {
                array[row][cell] = num;
                cell++;
            }
            if (cell == cells) {
                    row++;
                    cell = 0;
            }
        }
        return array;
    }
}
