package ru.job4j.oop.tracker;

public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items ";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ====");
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println("All items: " + item);
            }
        } else {
            System.out.println("items not found");
        }
        return true;
    }
}
