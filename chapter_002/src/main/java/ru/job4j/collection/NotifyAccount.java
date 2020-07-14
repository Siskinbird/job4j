package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 /* Класс NotifyAccount устраняет дубликаты клиентов банка
 * @author Dmitry Chizhov
 * @since 14.07.20
 * @version 1.00
 */
public class NotifyAccount {
    /**
     * Метод sent возвращает аккаунты клиентов банка без дубликатов
     * @param accounts - Аккаунты клиентов банка
     * @return - возвращает аккаунты клиентов банка без дубликатов
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account account : accounts) {
            result.add(account);
        }
        return result;
    }
}
