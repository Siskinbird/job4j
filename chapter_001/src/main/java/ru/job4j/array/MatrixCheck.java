package ru.job4j.array;
/*
6.7.1. Моно строка и столбец в матрице.[#221823]
 */

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) { // создаем метод
        boolean result = true;                                    // ждём результат
        for ( int i = 0 ; i<board.length ; i++) {               //диапазон счетчика цыкла строки
            if (board[row][i] == i ) {                        // условие продвижения по строке с индексом row и столбцам i++
                result = false;                             // если условие не выполняется завершаем цыкл, возвращаем false
                break;                                    // прерыватель цыкла
            }
            System.out.print(board[row][i] + "  ");     // ручной тест , для себя, так как true очень обширное понятие, а так я вижу что творю
        }
        System.out.println();
        return result;                          // возвращаем результат
    }
    public static boolean monoVertical(char[][] board, int column) {  // те же яйца только в профиль!
        boolean result = true;
        for ( int i = 0 ; i<board.length ; i++) {
            if (board[i][column] == i) { // условие продвижения по столбцу с индексом column и строке i++
                result = false;
                break;
            }
            System.out.println(board[i][2]);
        }

        return result;
    }
}