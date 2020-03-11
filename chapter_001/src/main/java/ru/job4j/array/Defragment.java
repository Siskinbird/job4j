package ru.job4j.array;

public class Defragment {
    /**
     * Difragment task.
     *
     * @author Chizhov Dmitry (dima@chig@gmail.com)
     * @version 13.0
     * @since 26.02.2020 - 04.03.2020
     * @method compress Дефрагментация массива
     **/
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length) {
                    if (array[point] != null) {
                        array[index] = array[point];
                        array[point] = null;
                        index++;
                    }
                    point++;
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);

        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}



//Хоспаде