package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;     // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0 ; index<data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;                            // если элемента нет в массиве, то возвращаем -1.
        for (int i = start ; i < finish; i++) { // задаём диапазон поиска индекса
            if (data[i] == el) {                // если индекс массива равен елементу
                return i;                       // возвращаем индекс массива
            }
        }return rst;

    }
    public static int[] sort(int[] data) {

        for(int i=0; i<data.length; i++){ // 1цикл Задаём диапазон наших действий и счетчик индекса массива
                                         // 2й цикл повторяем всё то же самое только новым тиком счетчика i++
            int temp = data[i]; // присваиваем временной переменной значение положения счетчика в массиве
            int min = MinDiapason.findMin(data, i, data.length-1); // ищем минимальное значение в диапозоне от счётчика до длинны массива минус еденичку
        int index = FindLoop.indexOf(data, min, 0, data.length); // ищем индекс минимального значения в диапазоне
        data[i]=data[index]; // меняем местами временную переменную с найденным индексом минимального значения
        data[index]=temp; // задаём новое значение временной переменной
        }
        return data;
    }
}
// PROFIT!!!
// Два дня ковырял эту задачу, и кажется сильно прокачал свой скил использования дебагера!







