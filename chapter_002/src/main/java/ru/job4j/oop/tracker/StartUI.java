package ru.job4j.oop.tracker;

/**
 * Пользовательский интерфейс программы Tracker
 */
public class StartUI {
    /**
     * Метод добавления заявки в хранилище
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }
    /**
     * Показать все заявки.
     */
    public static void allItems (Tracker tracker){
        System.out.println("=== Show all items ====");
        System.out.println("All items: ");
        Item[] items = tracker.findAll();
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("items not found");
        }
    }
    /**
     * Перезапись заявки.
     */
    public static void renameItem(Input input, Tracker tracker){
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            System.out.println("Item replaced");
        } else {
            System.out.println("Error: Item doesn't exist");
        }
    }
    /**
     * Метод удаления заявки.
     */
    public static void delItem(Input input, Tracker tracker){
        System.out.println("=== Delete item ====");
        String enterId = input.askStr("Enter id: ");
        if (tracker.delete(enterId)) {
            System.out.println( "Item deleted" );
        } else {
            System.out.println("Item not found");
        }
    }
    /**
     * Поиск по id
     */
    public static void findId(Input input, Tracker tracker){
        System.out.println("=== Find item by id ====");
        String idToFiend = input.askStr("Enter Id: ");
        Item item = tracker.findById(idToFiend);
        if (item != null){
            System.out.println(item);
        } else {
            System.out.println("this item doesn't exist");
        }
    }
    /**
     * Поиск по имени
     */
    public static void findName(Input input, Tracker tracker){
        System.out.println("=== Find item by name ====");
        String name = input.askStr("Enter name: ");
        Item[] items = tracker.findByName(name);
        if (items.length != 0) {
            for (Item item : items) {
                System.out.println(item);
            }
        } else {
            System.out.println("Items not found");
        }
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.allItems(tracker);
            } else if (select == 2) {
                StartUI.renameItem(input, tracker);
            } else if (select == 3) {
                StartUI.delItem(input, tracker);
            } else if (select == 4) {
               StartUI.findId(input, tracker);
            } else if (select == 5) {
                StartUI.findName(input, tracker);
            }else if (select == 6) {
                System.out.println("Bye bye.");
                run = false;
            }
        }
    }
    /**
     * Меню интерфейса программы Tracker
     */
    private void showMenu() {
        System.out.println("0. Add new Item");//
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }
    /**
     * Мэйн метод интерфейса программы Tracker
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}