package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound]; // Массив данных по имени rst
       for (int x = 0; x < bound; x++) { //условие цикла
           rst[x] = x * x;         // возведение в квадрат и запись в массив
       }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {  // не понятно вообще
            System.out.println(array[index]);
        }
    }
}