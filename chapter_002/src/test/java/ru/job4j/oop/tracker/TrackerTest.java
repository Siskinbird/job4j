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
        Item name = new Item("Anton");
        Item name1 = new Item("Igar");
        Item name2 = new Item("Egor");
        tracker.add(name);
        tracker.add(name1);
        tracker.add(name2);
        Item[] found = tracker.findByName(name1.getName());
        assertThat(found, is(new Item[]{name1}));
    }
    @Test
    public void when3NameFind() {
        Tracker tracker = new Tracker();
        Item name = new Item("Igar");
        Item name1 = new Item("Igar");
        Item name2 = new Item("Igar");
        tracker.add(name);
        tracker.add(name1);
        tracker.add(name2);
        Item[] found = tracker.findByName(name.getName());
        assertThat(found, is(new Item[]{name, name1, name2}));

}
}



