package ru.job4j.condition;

/**
 * Class Перегрузка метода МАХ
 * @author Dmitry Chizhov dimachig@gmail.com
 * @since 14.03.20
 */

public class Max { //Класс
    /**
     * @param first
     * @param second
     * @return
     */
    public static int max(int first, int second) { //Метод,вводим переменные
        int result = Math.max(first, second); // Сравнение переменных
        return result; // Возвращение результата
    }
    /**
     * Максимум из трёх чисел
     * @param first
     * @param second
     * @param third
     * @return
     */
    public int max(int first, int second, int third) {
       int result = Math.max(third, max(first, second));
        return result;
    }
    /**
     * Максимум из четырёх чисел
     * @param first
     * @param second
     * @param third
     * @param four
     * @return
     */
    public int max(int first, int second, int third, int four) {
        int result = Math.max(four, max(first, second, third));
        return result;

    }

    public static void main(String[] args) {
        Max max = new Max();
        System.out.println(max.max(13, 33, 49));
        System.out.println(max.max(49, 98, 112, 42));
    }

}