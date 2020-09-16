package ru.job4j.stream;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 /* Analyze class analysis of statistics on certificates.
 * @author Dmitry Chizhov
 * @since 10.09.20
 * @version 1.00
 */
public class Analyze {
    /**
     * The "averageScore" method calculates the overall average score.
     * @param stream - of Pupil objects
     * @return - overall average score
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D);
    }

    /**
     * The "averageScoreBySubject" method calculates the student's grade point average score.
     * @param stream - of Pupil objects
     * @return - Returns a list from a Tuple object (student name and grade point average).
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return  stream
                .map(pupil -> new Tuple(pupil.getName(), pupil
                        .getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore)
                        .average()
                        .getAsDouble())).collect(Collectors.toList());
    }

    /**
     * The "averageScoreByPupil" method calculates the average score across all subjects for each student.
     * @param stream - of Pupil objects
     * @return - Returns a list from a Tuple object (subject name and grade point average).
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects()
                        .stream())
                .collect(Collectors.groupingBy(Subject::getName, LinkedHashMap::new, Collectors.averagingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(stringListEntry -> new Tuple(stringListEntry.getKey()
                        , stringListEntry.getValue())).collect(Collectors.toList());
    }

    /**
     * BestStudent method - Returns the best student. The student with the highest score in all subjects is considered the best.
     * @param stream - of Pupil
     * @return - Returns a Tuple object (the name of the subject, the sum of each subjects score in this Student)
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream
                .map(pupil -> new Tuple(pupil.getName(), pupil
                        .getSubjects()
                        .stream()
                        .mapToInt(Subject::getScore).sum()))
                .max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }

    /**
     * BestSubject - Returns the subject with the highest score for all students.
     * @param stream - Stream of Pupil
     * @return -  Returns a Tuple object (the name of the subject, the sum of each student's score in this subject)
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects()
                        .stream())
                .collect(Collectors.groupingBy(Subject::getName
                        , LinkedHashMap::new, Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(stringListEntry -> new Tuple(stringListEntry.getKey()
                        , stringListEntry.getValue())).max(Comparator.comparing(Tuple::getScore)).orElse(null);
    }
}