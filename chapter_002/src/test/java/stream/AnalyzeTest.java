package stream;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;
import ru.job4j.stream.Analyze;
import ru.job4j.stream.Pupil;
import ru.job4j.stream.Subject;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AnalyzeTest {

    @Test
    public void whenSinglePupil() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100)))
                ).stream()
        );
        assertThat(average, is(100D));
    }

    @Test
    public void whenPupilAverage() {
        double average = Analyze.averageScore(
                List.of(
                        new Pupil("Ivanov", List.of(new Subject("Math", 100))),
                        new Pupil("Petrov", List.of(new Subject("Math", 60)))
                ).stream()
        );
        assertThat(average, is(80D));
    }
}
