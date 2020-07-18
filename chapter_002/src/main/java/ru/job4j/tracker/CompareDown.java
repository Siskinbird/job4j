package ru.job4j.tracker;

import java.util.Comparator;

/**
 * Ascending comparator for class Item data model
 */
public class CompareDown implements Comparator<Item> {

    @Override
    public int compare(Item o2, Item o1){
        return o2.getName().compareTo(o1.getName());
    }
}
