package ru.job4j.oop.tracker;

import org.junit.Test;

public class TrackerTest {
    @Test
    public void whenAdd() {
        Tracker tracker = new Tracker();
        Item igar = new Item("Игарь");
        String id = igar.getId();
        String name = igar.getName();
        tracker.add(igar);
    }
  }
