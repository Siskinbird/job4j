package ru.job4j.oop.tracker;

import org.junit.Assert;
import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
    @Test
    public void whenNameFind() {
        Tracker tracker = new Tracker();
        Item igar = new Item("Igar");
        tracker.add(igar);
        Item find = tracker.findByName(igar.getName());
        assertThat(find.getName(), is("Igar"));
    }
    //@Test
    //public void whenNameFind(){
    //    Tracker tracker = new Tracker();
    //    Item igar = new Item("Igar'");
    //    taracker.add(igar);
    //    String id =
    //    tracker.findByName("Igar'");

    //    assertThat(Item[], is(item.getName()));



               // , is(tracker.findByName("Igar'")));

    }
 // }
