package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    @Override
    public String name() {
        return "Find item by id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String idToFiend = input.askStr("Enter Id: ");
        Item item = tracker.findById(idToFiend);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("this item doesn't exist");
        }
        return true;
    }
}
