package ru.job4j.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    /**
     * Метод  вставляет в нужную позицию элемент.
     * Позиция определяется по полю приоритета.
     * Для вставки используется add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
           if(element.getPriority() >= task.getPriority()){
               break;
           }index++;
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.poll();
    }
}

