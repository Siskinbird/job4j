package ru.job4j.condition;

public class Max { //Класс
    public static int max(int left, int right) { //Метод,вводим переменные
        boolean condition = left > right; // Тернарное условие
        int result  = condition ? left : right; // Сравнение переменных
        return result; // Возвращение результата
    }

}