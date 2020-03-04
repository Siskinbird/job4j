package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
       int h = p / (2 * (k + 1));
       int s = h * h * k;
        return s;
    }

    public static void main(String[] args) {
        double result = square(4, 1);
        double result1 = square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result);
        System.out.println(" p = 6, k = 2, s = 1, real = " + result1);
    }
}
