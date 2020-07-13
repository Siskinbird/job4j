package ru.job4j.tracker;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class Tracker {
    /**
     * Коллекция для хранения заявок.
     */
    private final List<Item> items = new ArrayList<>();
    /**
     * Метод добавления заявки в коллекцию
     * @param item новая заявка
     * @return Заполняет ячейку массива именем + сгенерированным id
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
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
     * Метод вывода содержимого коллекции заявок
     * @return Возвращает коллекцию.
     */
    public List<Item> findAll() {
        return items;
    }

    /**
     * Поиск индекса заявки по id

     * @param id - уникальный ключ
     * @return Возвращает результат поиска.
     */

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }
    /**
     * Поиск по id
     * @param id - уникальный ключ
     * @return возвращает результат поиска
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }
    /**
     * Поиск по имени
     * @param key - Искомое имя
     * @return Возвращает коллекцию найденных имён
     */
    public List<Item> findByName(String key) {
        List <Item> found = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                found.add(item);
            }
        }  return found;
    }
    /**
     * Замена заявки id
     * @param id - Уникальный ключ
     * @param item - Заявка
     * @return - логический ответ
     */
    public boolean replace(String id, Item item) {
        int index = indexOf(id);
        if (indexOf(id) != -1) {
            items.set(index, item);
            item.setId(id);
            return true;
        }
        return false;
    }
    /**
     * Удаление заявки id
     * @param id - индивидуальный номер заявки
     */
    public boolean  delete(String id) {
        int index = indexOf(id);
        if(indexOf(id) != -1) {
            items.remove(items.get(index));
            return true;
        }
        return false;
    }
}



