package ru.job4j.stream;


import java.util.Collection;
import java.util.List;
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
     *
     The "averageScoreBySubject" method calculates the student's grade point average score.
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

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return null;
    }
}