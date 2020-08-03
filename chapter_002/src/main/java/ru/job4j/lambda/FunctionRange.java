package ru.job4j.lambda;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Implementing a counting function in a range
 */

public class FunctionRange {
    public static List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (; start < end; start++){
            Function<Integer, Double> convert = x -> (double) x;
            result.add(func.apply(convert.apply(start)));
        }return result;
    }
}
