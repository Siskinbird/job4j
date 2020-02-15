package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas14ThenNo() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 23, 17};
        int value = 1;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas14Then1() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 14, 17};
        int value = 14;
        int result = find.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas17Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 23, 17};
        int value = 17;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));
    }
    @Test
    public void whenArrayHas42Then4() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {11, 23, 17, 33, 42, 64, 39, 77};
        int value = 42;
        int result = find.indexOf(input, value);
        int expect = 4;
        assertThat(result, is(expect));
    }
}