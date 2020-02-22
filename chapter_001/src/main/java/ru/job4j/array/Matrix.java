package ru.job4j.array;
/*
Заполнение 2х мерного массива таблицей умножения
 */


public class Matrix {
    public int[][] multiple(int size) { // название метода
        int[][] table = new int[size][size]; // вход для размера массива
        for (int i = 0; i < table.length; i++) { // цикл для вертикальных значений
            for (int j = 0; j < table[i].length; j++) { // цикл для горизонтальных значений в диапазоне от нуля до длинны индекса вертикальных значений
                table[i][j] = (i+1)*(j+1); // умножаем вертикаль на горизонталь +1 - обходим умножение ноля на ноль и т.д.
                System.out.print(table[i][j] + "  "); // красиво выводим
            }
            System.out.println(); // Чтоб получился квадратик
        }return table;
    }
}
