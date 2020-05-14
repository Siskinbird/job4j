package ru.job4j.oop.tracker;

/**
 * Интерфейс пользователя UserAction
 */

public interface UserAction {
    String name();

    boolean execute(Input input, Tracker tracker);
}
