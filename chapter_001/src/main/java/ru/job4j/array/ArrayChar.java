package ru.job4j.array;

/**
 * ArrayChar task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 05.02.2020
 **/

public class ArrayChar {
    /**
     * @param word
     * @param pref
     * @return result
     * Слово начинается на ...
     **/
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != word[index]) {
                return false;
            }
        }
        return result;
    }
}


