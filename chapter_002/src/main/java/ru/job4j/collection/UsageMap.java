package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("lebowski@gmail.com","Big Lebowski");
        map.put("tarantino@list.ru", "Kventin Tarantino");
        map.put("gagarin@cosmos.universe", "Yura, zaberi Tereshkovu");
        map.put("film@interstellar.com", "Normal'niy Film");
        for (String key : map.keySet()){
            String value = map.get(key);
            System.out.println(value + " : email: " + key);
        }
    }
}
