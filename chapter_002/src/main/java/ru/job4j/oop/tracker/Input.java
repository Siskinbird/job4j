package ru.job4j.oop.tracker;

/**
 * Интерфейс пользователя
 */

public interface Input {
    String askStr(String question);
    int askInt(String question);
    int askInt(String question, int max);
}
