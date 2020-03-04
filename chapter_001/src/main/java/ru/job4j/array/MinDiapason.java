package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start]; // точка вхождения
        for (int index = start; index <= finish; index++) { // задаём диапазон поиска
           if (min > array[index]) { // сравниваем значение минимума с значением из массива
            min = array[index]; // если условие выполняется, переписываем переменную минимум
               // возвращаем новый минимум в начало метода
           }



      }
        return min;  // всё кончено, дальше пути нет, возвращаем минимум найденный в диапазоне start - finish
    }
}
// Profit !!!