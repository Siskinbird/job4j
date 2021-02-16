package collection;
import org.junit.Test;
import ru.job4j.collection.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = List.of(new int[] {1}, new int[] {2, 3});
        List<Integer> expect = List.of(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
    @Test
    public void whenTreeList() {
        List<int[]> in = List.of(new int[] {1}, new int[] {2, 3}, new int[] {4, 5, 6, 7, 8, 9});
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(ConvertList.convert(in), is(expect));
    }
    @Test
    public void whenFourList() {
        List<int[]> in = List.of(new int[] {1}, new int[] {2, 3}, new int[] {4, 5, 6, 7, 8, 9}, new int[] {10, 11, 12, 13, 14, 15});
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
