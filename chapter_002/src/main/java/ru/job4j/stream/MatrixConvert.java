package ru.job4j.stream;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * Class MatrixConvert turns a Array of integers into a List
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 12.08.2020
 * @version 1.00
 */
public class MatrixConvert {
    /**
     * Method convert turns a Array of integers into a List
     * @param inCome - Takes a two-dimensional array
     * @return - The list obtained from the input two-dimensional array
     */

    public static List<Integer> convert(Integer[][] inCome) {
        return Stream.of(inCome).flatMap(Stream::of).collect(Collectors.toList());
    }
}