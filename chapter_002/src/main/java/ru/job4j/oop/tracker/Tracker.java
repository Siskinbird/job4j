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
     * Поиск индекса заявки по id
     *
     * @param id
     * @return Возвращает результат поиска.
     */

    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Поиск по id
     *
     * @param id
     * @return возвращает результат поиска
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
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
                counter++ ;                           // полученный массив found обрезаю до position
            }                                        //
        }                                           //
        return Arrays.copyOf(found, counter);                              //Если совпадений не найденно, возвращаю пустой массив
    }

    /**
     * Перезапись ячейки с сохранением id
     *
     * @param id
     * @param item
     */
    public boolean replace(String id, Item item) { // Переписать ( айди, объект)
        int index = indexOf(id); // ищем индекс по входящей строке айди (534872648)!
        items[index] = item;     // записываем в ячейку массива с индексом найденным по входящему айди(534872648)
        return true;


    }
}


    //Метод indexOf нужно использовать в методе replace.
    //
    //Весь метод replace будет состоять из 3 строчек кода.
    //
    //1. Найти индекс ячейки по id. indexOf(id)
    //
    //2. Проставить id с item. При замене нужно сохранять старый id.
    //
    //3. Записать в ячейку с найденным индекс объект item. Это входящий параметр.

    //for (int i = 0; i < position; i++) {
         //   if (items[i].getId().equals(id)) {
        //       return items[i];
        //    }
       // }
       // return null;
   // }
    //public Item findById(String id) {
    //    // Находим индекс

    //    // Если индекс найден возвращаем item, иначе null
    //    return index != -1 ? items[index] : null;
    //}



