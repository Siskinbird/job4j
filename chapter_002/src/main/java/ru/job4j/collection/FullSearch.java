package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 /* Класс FullSearch реализует поиски уникальных задач в списке
 * @author Dmitry Chizhov
 * @since 13.07.20
 * @version 1
 */

public class FullSearch {
    /**
     * Метод extractNumber добавляет задачи в коллекцию
     * @param list - коллекция уникальных задач
     * @return - уникальные задачи
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
