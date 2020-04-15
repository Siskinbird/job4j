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
     * @return Заполняет ячейку массива именем + сгенерированным id
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
     * Копирует только заполненные ячейки массива, возвращает новую длинну массива
     *
     * @return Возвращает массив элементов и новый размер.
     */

    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Поиск по id
     *
     * @param id
     * @return возвращает результат поиска
     */
    public Item findById(String id) {
        for (int i = 0; i < position; i++) {
            if (items[i].getId().equals(id)) {
                return items[i];
            }
        }
        return null;
    }

    /**
     * Поиск по имени
     *
     * @param key
     * @return возвращает результат поиска или пустой массив.
     */

    public Item[] findByName(String key) {
        Item[] found = new Item[position];                  // Создаю массив длинной с position
        int counter = 0;                                   // счетчик "подходящих" заявок
        for (int index = 0; index < position; index++) {  // перебераю массив
            Item current = items[index];                 // присваиваю current значение items[index]
            if (current.getName().equals(key)) {        // сравниваю ячейку массива с параметром key
                found[counter] = current;              // если совпадение найдено , то записываю значение current в массив found[counter]
                return Arrays.copyOf(found, position);// полученный массив found обрезаю до position
            }                                        //
        }                                           //
        return items;                              //Если совпадений не найденно, возвращаю пустой массив
    }
}
// Спасибо за терпение, правда)