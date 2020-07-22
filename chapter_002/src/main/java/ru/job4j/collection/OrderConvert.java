package ru.job4j.collection;



import java.util.HashMap;
import java.util.List;

/**
 /* Класс OrderConvert реализует возможность работать со списком по номеру.
 * @author Dmitry Chizhov
 * @since 16.07.20
 * @version 1.00
 */
public class OrderConvert {
    /**
     * Метод process реализует преобразование списка в Hash карту.
     * @param orders - список заказов
     * @return - Hash карту
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
