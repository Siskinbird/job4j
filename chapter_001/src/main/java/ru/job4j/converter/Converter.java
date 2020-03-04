package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int euroToRuble(int value) {
        return value * 70;
    }
    public static int dollarToRuble(int value)  {
        return value * 60;
    }
    public static void main(String[] agrs) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euros. Test result : " + passed);
        int in1 = 120;
        int expected1 = 2;
        int out1 = rubleToDollar(in1);
        boolean passed1 = expected1 == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed1);
        int in2 = 1;
        int expected2 = 70;
        int out2 = euroToRuble(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("1 euro are 70 rubles. Test result : " + passed2);
        int in3 = 1;
        int expected3 = 60;
        int out3 = dollarToRuble(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("1 dollar are 60 rubles. Test result : " + passed3);
    }
}
