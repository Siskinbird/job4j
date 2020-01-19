package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int result = first;
        if (first > second) {
            boolean great1 = first > third;
            return result;
        }
        int result1 = second;
        if (second > third) {
            boolean great2 = second > third;
            return result1;
        }
        return result1;
    }
}

