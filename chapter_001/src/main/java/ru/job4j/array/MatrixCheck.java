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
     * Горизонтальная строка
     **/
       public static boolean monoHorizontal(char[][] board, int row) {

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != board[row][0]) {
                result = false;
                break;
            }
            System.out.print(board[row][i] + "  ");
        }
        System.out.println();
        return result;
    }
    /**
     * @param board
     * @param column
     * @return result
     *  Моно столбец в матрице
     */
        public static boolean monoVertical(char[][] board, int column) {

        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != board[0][column]) {
                result = false;
                break;
            }
            System.out.println(board[i][column]);
        }
        return result;
    } /**
     * @param board
     * @return rsl
     * Массив из диагонали матрицы
     */

       public static char[] extractDiagonal(char[][] board) {

        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }
    /**
     * @param board
     * @return result
     * Выигрышные комбинации
     */
    public static boolean isWin(char[][] board) {

        boolean result = false;
        for (int index = 0; index < board.length; index++) {
                if (board[index][index] == 'X' && (monoHorizontal(board, index) || monoVertical(board, index))) {
                    result = true;
                break;
            }
        }
        return result;
    }
}