package ru.job4j.array;
/*
6.7.1. Моно строка в матрице.[#221823]
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) { // создаем метод
        boolean result = true;                                    // ждём результат
        for ( int i = 0 ; i<board.length ; i++) {               //диапазон счетчика цыкла строки
            if (board[1][i] == i ) {                          // условие продвижения по строке, только по строке с индексом 1 и столбцам i++
                result = false;                             // если условие не выполняется завершаем цыкл, возвращаем false
                break;                                    // прерыватель цыкла
            }
            System.out.print(board[1][i] + "  ");     // ручной тест , для себя, так как true очень обширное понятие, а так я вижу что творю
        }
        System.out.println();
        return result;                          // возвращаем результат
    }
}