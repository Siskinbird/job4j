package collection;
import org.junit.Test;
import ru.job4j.collection.*;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test class for combined comparators
 */
public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByNameLn().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenAscCombCmp() {
        Comparator<Job> cmpAsc = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpAsc.compare(
                new Job("Pospat' task", 42),
                new Job("Pospat' task", 69));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenDesCombCmp() {
        Comparator<Job> cmpDesc = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpDesc.compare(
                new Job("Pomolitsya task", 7),
                new Job("Pomolitsya task", 1));
        assertThat(rsl, lessThan(0));
    }
}