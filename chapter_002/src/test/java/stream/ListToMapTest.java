package stream;

import org.junit.Test;
import ru.job4j.stream.ListToMap;
import ru.job4j.stream.Student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test's for class ListToMap
 */
public class ListToMapTest {
    @Test
    public void whenAllWrite() {
        List<Student> comeIn = Arrays.asList(
                new Student("Lukashenko", 3),
                new Student("Tikhanovskaya", 97),
                new Student("Dima", 66),
                new Student("Vasya", 44),
                new Student("Igor", 42));
        Map<String, Student> expect = Map.of(
                "Dima", new Student("Dima", 66),
                "Vasya", (new Student("Vasya", 44)),
                "Igor", (new Student("Igor", 42)),
                "Tikhanovskaya", (new Student("Tikhanovskaya", 97)),
                "Lukashenko", (new Student("Lukashenko", 3))
                );
        assertThat(ListToMap.mapIn(comeIn), is(expect));
    }
    @Test
    public void whenCallOne() {
        List<Student> comeIn = Arrays.asList(
                new Student("Lukashenko", 3),
                new Student("Tikhanovskaya", 97),
                new Student("Dima", 66),
                new Student("Vasya", 44),
                new Student("Igor", 42));
        Map<String, Student> expect = Map.of(
                "Dima", new Student("Dima", 66),
                "Vasya", (new Student("Vasya", 44)),
                "Igor", (new Student("Igor", 42)),
                "Tikhanovskaya", (new Student("Tikhanovskaya", 97)),
                "Lukashenko", (new Student("Lukashenko", 3))
        );
        assertThat(expect.get("Lukashenko"), is(new Student("Lukashenko", 3)));
    }
    @Test
    public void whenDuplicate() {
        List<Student> comeIn = Arrays.asList(
                new Student("Lukashenko", 3),
                new Student("Lukashenko", 3),
                new Student("Tikhanovskaya", 97),
                new Student("Dima", 66),
                new Student("Vasya", 44),
                new Student("Igor", 42));
        Map<String, Student> expect = Map.of(
                "Dima", new Student("Dima", 66),
                "Vasya", (new Student("Vasya", 44)),
                "Igor", (new Student("Igor", 42)),
                "Tikhanovskaya", (new Student("Tikhanovskaya", 97)),
                "Lukashenko", (new Student("Lukashenko", 3))
        );
        assertThat(expect.get("Lukashenko"), is(new Student("Lukashenko", 3)));
    }
}
