package ru.job4j.oop.tracker;

import java.util.Arrays;
import java.util.Random;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     *
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Метод принимает два параметра: массив элементов и новый размер.
     * Записывает в новый массив имена без пробелов
     *
     * @return
     */
    public Item[] findAll() {
        Item[] names = new Item[items.length];
        Item[] namesWithoutNull = new Item[names.length];
        int size = 0;
        for (int index = 0; index < names.length; index++) {
            Item name = names[index];
            if (name != null) {
                namesWithoutNull[size] = name;
                size++;
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }
        return namesWithoutNull;
    }

    public Item[] findByName(String key) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(key)) {
                System.out.println(items[i]);
            }
        } return items;
    }
    public  Item[] findById(String id) {
        for (int i = 0; i < items.length; i++) {
            if (generateId().equals(id)) {
                System.out.println(items[i]);
            }
        }
        return items;
    }
}
