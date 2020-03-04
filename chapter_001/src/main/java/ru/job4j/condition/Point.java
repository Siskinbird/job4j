package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x2 - x1, 2);
        double second = Math.pow(y2 - y1, 2);
        double result = Math.sqrt(first + second);
        return result;
    }
    public static void main(String[] args) {
        double result = distance(0, 0, 2, 0);
        double result1 = distance(3, 0, 2, 0);
        double result2 = distance(0, 11, 0, 17);
        double result3 = distance(2, 0, 7, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (3, 0) to (2, 0) " + result1);
        System.out.println("result (0, 11) to (0, 17) " + result2);
        System.out.println("result (2, 0) to (7, 0) " + result3);
    }
}
