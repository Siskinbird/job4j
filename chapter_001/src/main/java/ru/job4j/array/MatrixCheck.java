package ru.job4j.array;

/**
 * MatrixCheck task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 25.02.2020
 **/

public class MatrixCheck {
    /**
     * @method Моно строка в матрице
     * @param board
     * @param row
     * @return result
     **/

    public static boolean monoHorizontal(char[][] board, int row) { // создаем метод
        boolean result = true;                                    // ждём результат
        for ( int i = 0 ; i<board.length ; i++) {               //диапазон счетчика цыкла строки
            if (board[row][i] == row ) {                        // условие продвижения по строке с индексом row и столбцам i++
                result = false;                             // если условие не выполняется завершаем цыкл, возвращаем false
                break;                                    // прерыватель цыкла
            }
            System.out.print(board[row][i] + "  ");     // ручной тест , для себя, так как true очень обширное понятие, а так я вижу что творю
        }
        System.out.println();
        return result;                          // возвращаем результат
    }

    /**
     * @method Моно столбец в матрице
     * @param board
     * @param column
     * @return result
     */

    public static boolean monoVertical(char[][] board, int column) {  // те же яйца только в профиль!
        boolean result = true;
        for ( int i = 0 ; i<board.length ; i++) {
            if (board[i][column] == column) {                      // условие продвижения по столбцу с индексом column и строке i++
                result = false;
                break;
            }
            System.out.println(board[i][column]);
        }

        return result;
    }

    /**
     * @method Массив из диагонали матрицы
     * @param board
     * @return rsl
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        int i, j = 0;
        for (i = 0; i <board.length; i++) {
            rsl[j] = board[i][j];
            j++;
        }
            return rsl;
        }
    }