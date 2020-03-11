package ru.job4j.array;

public class AlgoArray {
    /**
     * AlgoArray task.
     * @author Chizhov Dmitry (dima@chig@gmail.com)
     * @version 13.0
     * @since 16.02.2020 - 04.03.2020
     * @method main Тренируемся менять местами ячейки в массиве.
     **/
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int temp = array[0];
        array[0] = array[3];
        array[3] = temp;
        array[3] = array[4];
        array[4] = temp;
        temp = array[1];
        array[1] = array[2];
        array[2] = temp;
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}