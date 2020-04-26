package ru.job4j.oop.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter Name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                System.out.print("All items: \n ");
                System.out.println(Arrays.toString(tracker.findAll()));
            } else if (select == 2){
                System.out.println("=== Edit item ====");
                System.out.println("Enter id: ");
                String id = scanner.nextLine();
                System.out.println("Enter new name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if(tracker.replace(id, item)){
                    System.out.println("Item replase");

                } else
                System.out.println("Error: Item doesn't exist");
            }
            else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.print("Enter name: ");
                String nameToDel = scanner.nextLine();
                if(tracker.delete(nameToDel)){
                    System.out.println("Item deleted");
                } else
                System.out.println("Error: Item doesn't exist");
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                System.out.print("Enter Id: ");
                String idToFiend = scanner.nextLine();
                System.out.println(tracker.findById(idToFiend));
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Found name: " + Arrays.toString(tracker.findByName(name)) + "\n");
            } else if (select == 6) {
                System.out.println("Bye bye.");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("0. Add new Item");//
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}