package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean prime = false;
        if ((finish % 5) == 0) {
            prime = true;
        }
        return prime;
    }
}