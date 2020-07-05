package ru.job4j.search;

public class Task {
    private String desc;
    private int priority;

    /**
     * Модель данных
     * @param desc
     * @param priority
     */

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }
    public String getDesc() {
        return desc;
    }
    public int getPriority() {
        return priority;
    }
}
