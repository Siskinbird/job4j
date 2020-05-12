package ru.job4j.oop.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    /**
     * Тест метода на добавление заявки
     */
    @Test
    public void whenAddItem() {
        String[] answers = {"Fix PC"};
        Input input = new StubInput(answers);
        Tracker tracker = new Tracker();
        StartUI.createItem(input, tracker);
        Item created = tracker.findAll()[0];
        Item expected = new Item("Fix PC");
        assertThat(created.getName(), is(expected.getName()));
    }
    /**
     * Тест метода на перезапись заявки
     */
    @Test
    public void whenItemReplaced() {
        Tracker tracker = new Tracker();  // Создаём объект tracker
        Item item = new Item("new item"); // Создаём объект item
        tracker.add(item); // добавляем item в tracker , item'у присваивается строка с id
        String[] answers = { item.getId(), "replaced item"}; // Создаём массив строк имитируя результат работы с пользователем
        StartUI.renameItem(new StubInput(answers), tracker); // Запуск интерфейса, выбор действия, изменение объекта tracker
        Item replaced = tracker.findById(item.getId()); //  Ищем по item.id замененный item в объекте tracker
        assertThat(replaced.getName(), is("replaced item"));

    }
    /**
     * Тест метода на удаление заявки
     */
    @Test
    public void whenItemDeleted(){
        Tracker tracker = new Tracker(); // Создаём объект tracker
        Item item = new Item("new item"); // Создаём объект item
        tracker.add(item); // добавляем item в tracker , item'у присваивается строка с id
        String[] answers = {item.getId(), "item deleted"}; // ответ при удачном удалении
        StartUI.delItem(new StubInput(answers), tracker); // Запуск интерфейса, выбор действия, изменение объекта tracker
        Item deleted = tracker.findById(item.getName()); // Проверка на отсутствие итема в трекере
        assertNull(deleted); // Сравнение результата проверки с null
    }
}

