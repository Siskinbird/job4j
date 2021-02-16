package ru.job4j.tracker;


import org.junit.Test;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ComparatorTest {
    @Test
    public void whenItemUp() {
        List<Item> items = Arrays.asList(
                new Item("Igor"),
                new Item("Slava"),
                new Item("Serega")
        );
        items.sort(new CompareUp());
        List<Item> expect = Arrays.asList(
                new Item("Igor"),
                new Item("Serega"),
                new Item("Slava")
        );
        assertThat(items, equalTo(expect));

    }
    @Test
    public void whenItemDown() {
        List<Item> items = Arrays.asList(
                new Item("Igor"),
                new Item("Slava"),
                new Item("Serega")
        );
        items.sort(new CompareDown());
        List<Item> expect = Arrays.asList(
               new Item("Slava"),
               new Item("Serega"),
               new Item("Igor")
        );
        assertThat(items, equalTo(expect));
    }
}