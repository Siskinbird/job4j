package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Using a stream to filter positive integers
 */
public class IntegerStream {
    public static void main(String[] args) {
        List<Integer> integers = List.of(7, -3, -34, 78, 43, 43, -34, 65, -55, -19, 9);
        List<Integer> positive = integers.stream().filter(integer -> integer > 0).collect(Collectors.toList());
        positive.forEach(System.out::println);
    }
}
