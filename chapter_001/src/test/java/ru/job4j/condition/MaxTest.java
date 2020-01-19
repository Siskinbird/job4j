package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Math.max(1, 2);
        assertThat(result, is(2));
    }
    @Test
    public void whenMax13To13Then13(){
        int result = Math.max(13, 13);
        assertThat(result, is(13));
    }
}