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
        boolean result = true;
        int count = 0;
        String[] origin = originText.split(" ");
        HashSet<String> check = new HashSet<>();
        String[] text = duplicateText.split(" ");
        for (String originOne : origin) {
            check.add(originOne);
            for (String textDuplicate : text) {
                if (originOne.contains(textDuplicate)) {
                    count++;
                    if (count == origin.length + 1) {
                        return result;
                    }
                }
            }
        }
        return false;
    }
}