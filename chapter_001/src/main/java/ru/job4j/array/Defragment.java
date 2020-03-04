package ru.job4j.array;

public class Defragment {
    /**
     * Difragment task.
     *
     * @author Chizhov Dmitry (dima@chig@gmail.com)
     * @version 13.0
     * @since 26.02.2020 - 04.03.2020
     **/
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (point < array.length) { // Его трогать не надо
                    if (array[point] != null) { // Тебе надо проверить что элемент массив с индексом Point не равен null
                        array[index] = array[point]; // если это так. то переставить его с index
                        array[point] = null;
                        index++;
                    }
                    point++;
                                        //если нет. то увеличить на 1 и проверить заново
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