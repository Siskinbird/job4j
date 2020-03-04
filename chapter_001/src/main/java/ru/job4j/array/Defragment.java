package ru.job4j.array;

public class Defragment {
    /**
     * Difragment task.
     *
     * @author Chizhov Dmitry (dima@chig@gmail.com)
     * @version
     * @since 26.02.2020 - 04.03.2020
     **/
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;                                       // указатель, на null ячейку.
                while ((array[index] == null)&&(point<array.length)) {  // Если условие true , то
                    array[index] = array[point];                       // переставляем index c point'ом
                    array[point] = null;                              // превращаем в null
                    point++;                                         // шагаем вперед point'омммм
                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}



//Хоспаде