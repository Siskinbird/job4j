package collection;
import org.junit.Test;
import ru.job4j.collection.ConvertList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        List<Integer> expect = Arrays.asList(1, 2, 3);
        assertThat(ConvertList.convert(in), is(expect));
    }
    @Test
    public void whenTreeList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        in.add(new int[] {4, 5, 6, 7, 8, 9});
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(ConvertList.convert(in), is(expect));
    }
    @Test
    public void whenFourList() {
        List<int[]> in = new ArrayList<>();
        in.add(new int[] {1});
        in.add(new int[] {2, 3});
        in.add(new int[] {4, 5, 6, 7, 8, 9});
        in.add(new int[] {10, 11, 12, 13, 14, 15});
        List<Integer> expect = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,10, 11, 12, 13, 14, 15);
        assertThat(ConvertList.convert(in), is(expect));
    }
}
