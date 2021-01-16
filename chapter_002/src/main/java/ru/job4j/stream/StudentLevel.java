package ru.job4j.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * StudentLevel
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 13.08.2020
 * @version 1.00
 */
public class StudentLevel {
    /**
     * The method "levelOf" should return a list of students who have a certificate score greater than bound.
     * @param students - List of students
     * @param bound - Passing score
     * @return - list of students who have a certificate score greater than bound
     */
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList())
                .stream()
                .sorted(Comparator.comparing(Student::getScore))
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());
    }
}
