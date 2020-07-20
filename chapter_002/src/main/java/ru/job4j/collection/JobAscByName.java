package ru.job4j.collection;

import java.util.Comparator;

/**
 * Ascending comparator for the Job data model, by name
 */
public class JobAscByName implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
