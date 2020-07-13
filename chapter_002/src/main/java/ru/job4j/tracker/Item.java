package ru.job4j.tracker;

public class Item {
    private String id;
    private String name;

    @Override
    public String toString() {
        return  "Id: " + this.id + "; " + "Name: " + this.name;
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
}