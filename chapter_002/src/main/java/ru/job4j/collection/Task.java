package ru.job4j.collection;

/**
 * Модель данных "Задача"
 * @author Dmitry Chizhov
 * @since 13.07.20
 * @version 1.0
 */
public class Task {
    private String number;
    private String description;

    public Task(String number, String description){
        this.number = number;
        this.description = description;
    }
    public String getNumber(){
        return number;
    }
}
