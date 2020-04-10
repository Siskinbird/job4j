package ru.job4j.oop.tracker;

import org.junit.Test;

import java.util.Arrays;

public class TrackerTest {
    @Test
    public void add() {
        Item item = new Item("Серёжа");
    }
    @Test
    public void findAll() {
        String[] names = {"Petr", null, "Ivan", "Stepan", null};
        String[] namesWithoutNull = new String[names.length];

        //String[] namesWithoutNull = {"Petr", "Ivan", "Stepan"};
    }


}
