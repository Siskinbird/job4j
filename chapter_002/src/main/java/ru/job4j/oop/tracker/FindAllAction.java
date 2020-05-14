package ru.job4j.oop.tracker;

/**
 * Вывод всех заявок
 * Реализация интерфейса UserAction
 */
public class FindAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all items ";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        for (Item item : tracker.findAll()) {
            System.out.println(String.format("%s %s", item.getId(), item.getName()));
        }
        return true;
    }
}
