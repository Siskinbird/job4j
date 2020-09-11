package ru.job4j.stream;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Analyze {

    public static OptionalDouble averageScore(Stream<Pupil> stream) {
        List<DoubleStream> sublist = stream.map(pupil -> pupil.getSubjects().stream().mapToDouble(Subject::getScore)).collect(Collectors.toList());
        OptionalDouble average = sublist.stream().mapToDouble(DoubleStream::sum).average();
        return average;
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return List.of();
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
