package ru.job4j.tracker;

import java.util.Objects;

/**
/* The Item class implements the data model for the Tracker class
 * @author Dmitry Chizhov
 * @since 18.07.20
 * @version 1.31
 */
public class Item  {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "Id: " + this.id + "; " + "Name: " + this.name;
    }

    public Item(String name) {
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


