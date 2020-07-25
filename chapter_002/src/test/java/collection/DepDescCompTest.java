package collection;

import org.junit.Test;
import ru.job4j.collection.DepDescComp;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Descending comparator test class
 */
public class DepDescCompTest {

    @Test
    public void compare() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK1"
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenUpDepartmentGoBefore() {
        int rsl = new DepDescComp().compare(
                "K2",
                "K2/SK1"
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void eqZero() {
        int rsl = new DepDescComp().compare(
                "K2/SK1/SSK2",
                "K2/SK1/SSK2"
        );
        assertThat(rsl, equalTo(0));
    }

}