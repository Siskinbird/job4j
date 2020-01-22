package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax(); // Второе большее
        int result1 = check.max(1, 4, 2);
        assertThat(result1, is(4));
    }
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax(); // Первое большее
        int result1 = check.max(42, 4, 2);
        assertThat(result1, is(42));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax(); // Третье большее
        int result1 = check.max(1, 4, 13);
        assertThat(result1, is(13));
    }
}

