package ru.job4j.stream;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * The class sorts the students of the school by
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 07.08.2020
 * @version 1.00
 */
public class School {
    /**
     *
     * @param students - List of students
     * @param predict - Sort by grade function
     * @return - Sorted list
     */
    public static List<Student> collect(List<Student> students, Predicate<Student> predict) {
        List<Student> scoreList = students.stream().filter(predict).collect(Collectors.toList());
        return scoreList;
    }
}
