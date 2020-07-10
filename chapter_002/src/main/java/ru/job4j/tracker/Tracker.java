package ru.job4j.tracker;

import java.util.Random;
import java.util.ArrayList;

public class Tracker {
    /**
     * Массив для хранения заявок.
     */
 //   private final Item[] items = new Item[100];
    private final ArrayList<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
 //   private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     *
     * @param item новая заявка
     * @return Заполняет ячейку массива именем + сгенерированным id
     */
    public Item add(Item item) {
        item.setId(generateId());
       // items[position++] = item;
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
//    public Item[] findAll() {
//        return Arrays.copyOf(items, position);
//    }


    public ArrayList<Item> findAll() {
       ArrayList<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName() != null) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Поиск индекса заявки по id
     *
     * @param id
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
     *
     * @param id
     * @return возвращает результат поиска
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    /**
     * Поиск по имени
     *
     * @param key
     * @return возвращает результат поиска или пустой массив.
     */

    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> found = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().contains(key)) {
                found.add(item);
            }
        } return found;
    }


//    public Item[] findByName(String key) {
//        Item[] found = new Item[position];
//        int counter = 0;
 //       for (int index = 0; index < position; index++) {
//            Item current = items[index];
 //           if (current.getName().equals(key)) {
//                found[counter] = current;
//                counter++;
//            }
//        }
//        return Arrays.copyOf(found, counter);
 //   }

    /**
     * Замена заявки id
     *
     * @param id
     * @param item
     * @return
     */


    public boolean replace(String id, Item item) {
        boolean result = false;
        int index = indexOf(id);
        if (index != -1) {
            items.set(index, item);
            item.setId(id);
            return true;
        }
        return result;
    }

    /**
     * Удаление заявки id
     * @param id - индивидуальный номер заявки
     */
public boolean  delete(String id) {
   // boolean result = false;
    //ArrayList<Item> found = new ArrayList<>();
    for (Item item : items) {
        if (item.getId().contains(id)) {
            items.remove(item);
            return true;
        }
    }return false;
}
   // public boolean delete(String id) {
    //        boolean result = false;
    //        int index = indexOf(id);
    //        int start = index + 1;
    //        int distPos = index;
    //        int size = position - index;
    //        if (index != -1) {
    //            System.arraycopy(items, start, items, distPos, size);
    //            items[position - 1] = null;
    //            position--;
    //            return true;
    //        }
    //        return result;
    //    }
}



