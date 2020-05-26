package ru.job4j.oop.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String enterId = input.askStr("Enter id: ");
        if (tracker.delete(enterId)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Item not found");
        }
        return true;
    }
}
