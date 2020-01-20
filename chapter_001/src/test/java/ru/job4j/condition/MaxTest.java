package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax2To1Then2() {
        int first = Max.max(4, 1);
        assertThat(first, is(4));
    }
    @Test
    public void whenMax1To2Then2(){
        int second = Max.max(1, 2);
        assertThat(second, is(2));
    }
    @Test
    public void whenMax4To4Then4(){
        int equals = Max.max(4, 4);
        assertThat(equals, is(4));
    }
}