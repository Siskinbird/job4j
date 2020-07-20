package ru.job4j.collection;


import java.util.*;

/**
 /* The Job class data model
 * @author Dmitry Chizhov
 * @since 20.07.20
 * @version 1.10
 */
public class Job implements Comparable<Job> {
    private String name;
    private int priority;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return priority == job.priority &&
                Objects.equals(name, job.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    public Job(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Job{" + name + ", " + priority + '}';
    }
    @Override
    public int compareTo(Job another) {
        return Integer.compare(priority, another.priority);
    }
}