package ru.job4j.array;

/**
 * MatrixCheck task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 25.02.2020
 **/

public class MatrixCheck {
    /**
     * @param board
     * @param row
     * @return result
     * @method Моно строка в матрице
     **/

    public static boolean monoHorizontal(char[][] board, int row) { // создаем метод
        boolean result = true;                                    // ждём результат
        for (int i = 0; i < board.length; i++) {               //диапазон счетчика цыкла строки
            if (board[row][i] != board[row][0]) {             // Сравниваем символ по координатам row и i с символом 'X'
                result = false;                             // Если по координатам row и i  нет 'X', возвращаем false
                break;                                    // прерыватель цыкла, выходим, всё кончено
            }
            System.out.print(board[row][i] + "  ");     // ручной тест , для себя, так как true очень обширное понятие, а так я вижу что творю
        }
        System.out.println();
        return result;                          // возвращаем результат
    }

    /**
     * @param board
     * @param column
     * @return result
     * @method Моно столбец в матрице
     */

    public static boolean monoVertical(char[][] board, int column) {  // те же яйца только в профиль!
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != board[0][column]) {   // Сравниваем символ по координатам  i и column  с символом 'X'
                result = false;                          // Если по координатам  i и column нет 'X', возвращаем false
                break;                                  // прерыватель цыкла, выходим, всё кончено
            }
            System.out.println(board[i][column]);
        }

        return result;
    }

    /**
     * @param board
     * @return rsl
     * @method Массив из диагонали матрицы
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0 ;i<board.length; i++ ) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * @method Выигрышные комбинации
     * @param board
     * @return result
     */

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int index = 0; index <= 5; index++ ) {
            if ((monoHorizontal(board, index) || monoVertical(board, index))) {  // Ничего не понятно, но оочень интересно!
                result = true;
                break;
            }
        }
        return result;
    }
}