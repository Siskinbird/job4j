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
     * @return Список подошедших пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> nameCheck = f -> f.getName().contains(key);
        Predicate<Person> surnameCheck = f -> f.getSurname().contains(key);
        Predicate<Person> phoneCheck = f -> f.getPhone().contains(key);
        Predicate<Person> addressCheck = f -> f.getAddress().contains(key);
        Predicate<Person> combine = nameCheck.or(surnameCheck).or(phoneCheck).or(addressCheck);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;

    }
}
