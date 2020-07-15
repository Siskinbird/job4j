package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 /* Класс PassportOffice реализует систему для паспортного стола с возможностью проверять,
 что гражданина с таким паспортом еще нет, а так же возможность получить информацию о гражданине по его паспорту.
 * @author Dmitry Chizhov
 * @since 15.07.20
 * @version 1.00
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Метод add добавляет в коллекцию уникальный номер, при условии его отсутствия в базе.
     * @param citizen - Гражданин
     * @return - логическое значение
     */
    public boolean add(Citizen citizen) {
        boolean rst = false;
        if (!citizens.containsKey(citizen)) {
            citizens.put(citizen.getPassport(), citizen);
            return true;
        }
        return rst;
    }

    /**
     * Метод  get получает данные о гражданине по паспорту
     * @param passport - уникальный номер паспорта гражданина
     * @return - возвращает уникального гражданина
     */
    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
