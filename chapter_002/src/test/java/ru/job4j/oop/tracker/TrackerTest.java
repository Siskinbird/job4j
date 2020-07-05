package ru.job4j.oop.tracker;

import org.junit.Test;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;


import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TrackerTest {

    /**
     * Тест на метод добавления заявки
     * tracker.add
     * Добавляем заявку с одинаковым именем
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Тест на метод поиск заявки по имени
     * tracker.findAll
     * Массив заполнен тремя заявками
     */
    @Test
    public void when3NameNewMass() {
        Tracker tracker = new Tracker();
        Item name = new Item("Anton");
        Item name1 = new Item("Igar");
        Item name2 = new Item("Egor");
        tracker.add(name);
        tracker.add(name1);
        tracker.add(name2);
        Item[] result = tracker.findAll();
        assertThat(result, is(new Item[]{name, name1, name2}));
    }

    /**
     * Тест на метод поиска всех имеющихся заявок
     * tracker.findAll
     * Найденные заявки идут в новый массив обрезаный по количеству заявок
     * Заявок не найдено
     */

    @Test
    public void whenNoItems() {
        Tracker tracker = new Tracker();
        Item[] result = tracker.findAll();
        assertThat(result, is(new Item[]{}));
    }

    /**
     * Тест на метод поиск заявки по id
     * tracker.findById
     * Заявка найдена
     */
    @Test
    public void whenIdFound() {
        Tracker tracker = new Tracker();
        Item number = new Item("Valeriy");
        Item number1 = new Item("Shiva");
        Item number2 = new Item("Ganesha");
        tracker.add(number);
        tracker.add(number1);
        tracker.add(number2);
        Item found = tracker.findById(number1.getId());
        assertThat(found.getName(), is("Shiva"));
    }

    /**
     * Тест на метод поиск заявки по имени
     * tracker.findByName
     * Найдено 3 заявки удовлетворяющие поиску
     */
    @Test
    public void when3NameFind() {
        Tracker tracker = new Tracker();
        Item name = new Item("Igar");
        Item name1 = new Item("Igar");
        Item name2 = new Item("Igar");
        tracker.add(name);
        tracker.add(name1);
        tracker.add(name2);
        Item[] found = tracker.findByName(name.getName());
        assertThat(found, is(new Item[]{name, name1, name2}));
    }

    /**
     * Тест на метод поиск заявки по имени
     * tracker.findByName
     * Найдена 1 заявка удовлетворяющие поиску
     */
    @Test
    public void whenNameFind() {
        Tracker tracker = new Tracker();
        Item name = new Item("Anton");
        Item name1 = new Item("Igar");
        Item name2 = new Item("Egor");
        tracker.add(name);
        tracker.add(name1);
        tracker.add(name2);
        Item[] found = tracker.findByName(name1.getName());
        assertThat(found, is(new Item[]{name1}));
    }
    /**
     * Тест на метод замены заявки
     * tracker.replace
     * Найдена 1 заявка
     */

        @Test
        public void whenReplace() {
            Tracker tracker = new Tracker();
            Item bug = new Item("Bug");
            tracker.add(bug);
            String id = bug.getId();
            Item bugWithDesc = new Item("Bug with description");
            tracker.replace(id, bugWithDesc);
            assertThat(tracker.findById(id).getName(), is("Bug with description"));
        }
    /**
     * Тест на метод удаления заявки
     * tracker.delete
     * Заявка удалена
     */
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
    }


