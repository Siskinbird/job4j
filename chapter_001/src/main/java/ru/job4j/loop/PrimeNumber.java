package ru.job4j.loop;

public class PrimeNumber {

    public int calc(int finish) {
        int count = 0;
        for (int index = 1; index <= finish; index++) {
            if (CheckPrimeNumber.check(index)) {
            }count=count+index;
            break;
        }
        return count;
    }
}

