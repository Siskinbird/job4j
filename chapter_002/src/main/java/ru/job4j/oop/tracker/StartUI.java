package ru.job4j.oop.tracker;


public class StartUI {
    /**
     * Пользовательский интерфейс программы Tracker
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter Name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                System.out.println("All items: ");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                String id = input.askStr("Enter id: ");
                String name = input.askStr("Enter new name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Item replaced");
                } else {
                    System.out.println("Error: Item doesn't exist");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                String enterId = input.askStr("Enter id: ");
                if (tracker.delete(enterId)) {
                   System.out.println( "Item deleted" );
                } else {
                   System.out.println("Item not found");
              }
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                String idToFiend = input.askStr("Enter Id: ");
                System.out.println(tracker.findById(idToFiend));
                if(tracker.findById(idToFiend) == null){
                    System.out.println("this item doesn't exist");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                for (int i = 0; i < items.length; i++) {
                    System.out.println("Found name: " + items[i]);
                }
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