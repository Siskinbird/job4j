package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
           boolean great = ab + bc > bc;
           boolean less =  ab < ac + bc;
           boolean greater = ab + bc > ac;

        return true;

        }
    }