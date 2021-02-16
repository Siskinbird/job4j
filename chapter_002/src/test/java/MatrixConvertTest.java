import org.junit.Test;
import ru.job4j.stream.MatrixConvert;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Test's for class MatrixConvert
 */

public class MatrixConvertTest {
    @Test
    public void whenWork() {
        Integer[][] array = {{1, 2}, {3, 4}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 4);
        assertThat(MatrixConvert.convert(array), is(expect));
    }
    @Test
    public void whenBigWork() {
        Integer[][] array = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 10, 11, 12, 13, 14, 15}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertThat(MatrixConvert.convert(array), is(expect));
    }
    @Test
    public void whenOutOfOrder() {
        Integer[][] array = {{1, 2, 3, 4, 5, 6, 7, 8}, {9, 33, 11, 12, 13, 44, 15}};
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 33, 11, 12, 13, 44, 15);
        assertThat(MatrixConvert.convert(array), is(expect));
    }



}
