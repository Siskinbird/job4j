package ru.job4j.stream;

import java.util.Objects;
/**
 * Data model for class School
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 07.08.2020
 * @version 1.00
 */
public class Student {
    private int score;
    private String surname;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return score == student.score
                &&
                Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{"
                +
                "score="
                + score
                +
                ", surname='"
                + surname
                + '\''
                +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }
}
