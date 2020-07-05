package ru.job4j.tracker;
/**
 * Поск по Имени
 * Реализация интерфейса UserAction
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find item by name";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findByName(input.askStr("Find items:"))) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}
