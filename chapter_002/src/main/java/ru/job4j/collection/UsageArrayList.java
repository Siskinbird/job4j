package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Создание списка с именами мужчин
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Valera");
        names.add("Genady");
        names.add("Ivan");
        names.add("Viktor");
        names.add("Afanasy");
        names.add("Semen");

        for (Object value : names) {
            System.out.println("His name is: " + value + "!");
        }
    }
}
