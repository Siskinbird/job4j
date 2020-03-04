package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BackCompareTest {
    @Test
    public void WhenTrue(){
        int[] left = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] right = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean result = BackCompare.compare(left, right);
        assertThat(result, is(true));
    }
    @Test
    public void WhenFalse(){
        int[] left = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] right = {3, 6, 7, 9, 2, 6, 7, 8};
        boolean result = BackCompare.compare(left, right);
        assertThat(result, is(false));
    }
}
