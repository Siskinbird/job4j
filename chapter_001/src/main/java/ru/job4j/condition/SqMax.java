package ru.job4j.condition;

public class SqMax {
    public static int max(int first, int second, int third, int forth) {

        int x = (first > second) ? first : second; // Сравниваем первое со вторым, записываем большее
        int y = (third > forth) ? third : forth; // Сравниваем третее с четвертым, записываем большее
        int z = (x > y) ? x : y; //Сравниваем первое большее со вторым большим
        return z; // ЭВРИКА блэд! Возвращаем результат
    }
}