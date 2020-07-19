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
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }
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
    public void whenEqualsTo() {
        int rsl = new User("Putin", 69).compareTo(new User("Putin", 69));
        assertThat(rsl, comparesEqualTo(0));
    }
    @Test
    public void whenGreaterThan() {
        int rsl = new User("Stalin", 69).compareTo(new User("Stalin", 31));
        assertThat(rsl, greaterThan(0));
    }

}
