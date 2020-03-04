package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) { // диапазон цыкла от 0 до длинны массива, шаг 1
           if (min > array[index]) { //если условие выполняется
               min = array[index]; // записываем в переменную минимум значение индекса
               // возвращаем измененное значение минимума
               // шагаем цикл с новым минимумом
           }
        }
        return min; // возвращаем значение минимума в конце цикла
    }
}
//Profit :)