package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
      int result = Factorial.calc(5);
      int expected = 120;
      assertThat(result, is(expected)); //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int result = Factorial.calc(0);
        int expected = 1;
        assertThat(result, is(expected)); //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
    }
    @Test
    public void whenCalculateFactorialForOneThenOne() {
        int result = Factorial.calc(1);
        int expected = 1;
        assertThat(result, is(expected)); //напишите здесь тест, проверяющий, что факториал для числа 1 равен 1.
         }
}