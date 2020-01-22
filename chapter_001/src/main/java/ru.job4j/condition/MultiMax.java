
package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
       int x = (first>second)?first:second; // Ищем большее из первого и второго
       int result = (x>third)?x:third; // Сравниваем с третьим
       return result; //Возаращаем результат
    }
}

