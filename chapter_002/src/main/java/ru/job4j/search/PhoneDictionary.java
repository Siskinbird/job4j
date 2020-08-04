package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;


public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();
    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подошедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<String> nameCheck = name -> name.contains(key);
        Predicate<String> surnameCheck = surname -> surname.contains(key);
        Predicate<String> phoneCheck = phone -> phone.contains(key);
        Predicate<String> addressCheck = address -> address.contains(key);
        Predicate<Person> combine = check -> nameCheck.or(surnameCheck).or(phoneCheck).or(addressCheck).test(key);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;

    }
}
