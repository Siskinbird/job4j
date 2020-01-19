package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean yes = (ab+bc)>bc;
        boolean yep = (ac+bc)>ab;
        boolean yea = (ab+bc)>ac;
        boolean no = (ab+bc)<bc;
        return false;
    }
}