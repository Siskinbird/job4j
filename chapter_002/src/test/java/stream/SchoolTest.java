package stream;

import org.junit.Test;
import ru.job4j.stream.School;
import ru.job4j.stream.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * JUnit tests for class School
 * @author Dmitrii Chizhov (dimachig@gmail.com)
 * @since 07.08.2020
 * @version 1.00
 */

public class SchoolTest {
    @Test
    public void sortFor10A() {
        Student studentA = new Student("Lukashenko", 97);
        Student studentB = new Student("Putler", 69);
        Student studentC = new Student("Yanukovich", 13);
        List<Student> students = new ArrayList<>();
        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        List<Student> result = School.collect(students, student -> student.getScore() > 70 && student.getScore() <= 100);
        assertThat(Arrays.asList(studentA), is(result));

    }
    @Test
    public void sortFor10B() {
        Student studentA = new Student("Lukashenko", 97);
        Student studentB = new Student("Putler", 69);
        Student studentC = new Student("Yanukovich", 13);
        List<Student> students = new ArrayList<>();
        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        List<Student> result = School.collect(students, student -> student.getScore() < 70 && student.getScore() >= 50);
        assertThat(Arrays.asList(studentB), is(result));

    }
    @Test
    public void sortFor10C() {
        Student studentA = new Student("Lukashenko", 97);
        Student studentB = new Student("Putler", 69);
        Student studentC = new Student("Yanukovich", 13);
        List<Student> students = new ArrayList<>();
        students.add(studentA);
        students.add(studentB);
        students.add(studentC);
        List<Student> result = School.collect(students, student -> student.getScore() > 0 && student.getScore() < 50);
        assertThat(Arrays.asList(studentC), is(result));

    }
}
