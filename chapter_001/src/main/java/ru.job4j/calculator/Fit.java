package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double hight){
        return (hight - 100) * 1.15;
    }
    public  static double womanWeight(double hight){
        return (hight - 110) * 1.15;
    }
    public static void main(String[] args) {
        double man = manWeight(182);
        double woman = womanWeight(169);
        System.out.println("Man 182 is " + man);
        System.out.println("Woman 169 is " + woman);
    }
}
