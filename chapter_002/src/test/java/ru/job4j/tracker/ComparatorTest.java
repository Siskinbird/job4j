package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ComparatorTest {
    @Test
    public void whenReverse() {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        Collections.sort(list, Collections.reverseOrder());
        List<Integer> expect = Arrays.asList(5, 4, 3, 2 ,1);
        assertThat(list, is (expect));
    }
    @Test
    public void whenUp(){
        List<Integer> list = Arrays.asList(4,8,3,2,7,6,1,5);
        Collections.sort(list);
        List<Integer> expect = Arrays.asList(1, 2, 3, 4 , 5, 6, 7, 8);
        assertThat(list, is (expect));
    }
}