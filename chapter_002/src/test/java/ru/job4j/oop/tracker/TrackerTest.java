package ru.job4j.oop.tracker;

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
        Item items = new Item("Igar");
        tracker.add(items);
        Item found = new Item("Igar");
        assertThat(tracker.findByName("Igar"), is("Igar"));
    }
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}


//    Tracker tracker = new Tracker();
//    Item items = new Item("Igar");
//    tracker.add(items);
//    Item[] result  = tracker.findByName(items.getName());
//    assertThat(result, is("Igar"));

//  Tracker tracker = new Tracker();
// String[] input = {"Vasya", "I", "wanna", "be", "Petya"};
// Item[] find = tracker.findByName("Vasya");
// String[] expected = {"Vasya"};
// assertThat(find, is(expected));

