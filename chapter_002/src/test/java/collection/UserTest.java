package collection;

import org.junit.Test;
import ru.job4j.collection.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Test class for User data model
 */
public class UserTest {

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenLessThan() {
        int rsl = new User("Ivan", 31).compareTo(new User("Petr", 32));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenGreaterThan() {
        int rsl = new User("Stalin", 69).compareTo(new User("Stalin", 31));
        assertThat(rsl, greaterThan(0));
    }

}
