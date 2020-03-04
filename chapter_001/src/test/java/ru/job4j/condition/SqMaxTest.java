package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void sqMax4() { // Четвертое большее
        SqMax check = new SqMax();
        int result = check.max(4, 2, 7, 8);
        assertThat(result, is(8));
    }
    @Test
    public void sqMax3() { // Третье большее
        SqMax check = new SqMax();
        int result = check.max(4, 2, 72, 7);
        assertThat(result, is(72));
    }
    @Test
    public void sqMax2() { // Второе большее
        SqMax check = new SqMax();
        int result = check.max(4, 9, 7, 2);
        assertThat(result, is(9));
    }
    @Test
    public void sqMax1() { // Первое большее
        SqMax check = new SqMax();
        int result = check.max(11, 2, 7, 4);
        assertThat(result, is(11));
    }
}

