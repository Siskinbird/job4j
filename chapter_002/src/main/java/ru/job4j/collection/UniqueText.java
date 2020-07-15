package ru.job4j.collection;


import java.util.*;

/**
 /* Класс UniqueText реализует проверку текста на идентичность
 * @author Dmitry Chizhov
 * @since 14.07.20
 * @version 1.00
 */

public class UniqueText {
    /**
     * Метод сравнивает оригинальный текст с проверяемым
     * @param originText    - Оригинальный текст
     * @param duplicateText - Проверяемый текст
     * @return - логический ответ
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        Collections.addAll(check, origin);
        for (String s : text) {
            if (!check.contains(s)) {
                return false;
            }
        }
        return rsl;
    }
}