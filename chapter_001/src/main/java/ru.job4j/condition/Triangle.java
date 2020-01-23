package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        boolean yep = (ac+bc)>ab;
        boolean yea = (ab+ac)>bc;
        return yep && yea; // && - Логическое И !Если все три условия выполняются то вернется true иначе false!!!
    }
}