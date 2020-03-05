package ru.job4j.calculator;

public class Calculator {
    /**
     * Class Класс для вычисления арефметических операций + - / ^
     * @author Dmitry Chizhov dimachig@gmail.com
     * @param first
     * @param second
     * @since 10.01.20
     */

    /**
     * Сложение
     * @param first Первый параметр
     * @param second Второй параметр
     */
    public static void add(double first, double second) {
        double result = first + second;
        System.out.println(first + "+" + second + "=" + result);
    }
    /**
     * Деление
     * @param first Первый параметр
     * @param second Второй параметр
     */
        public static void div(double first, double second) {
        double result = first / second;
        System.out.println(first + "/" + second + "=" + result);
    }
    /**
     * Умножение
     * @param first Первый параметр
     * @param second Второй параметр
     */
    public static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(first + "*" + second + "=" + result);
    }
    /**
     * Вычитание
     * @param first Первый параметр
     * @param second Второй параметр
     */
    public static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(first + "-" + second + "=" + result);
    }

    public static void main(String[] agrs) {
        add(1, 1);
        div(4, 2);
        multiply(2, 1);
        subtract(10, 5);
    }
}
