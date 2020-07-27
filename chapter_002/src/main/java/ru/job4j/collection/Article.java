package ru.job4j.collection;

import java.util.*;

/**
 *The class checks the text for the presence of words from the second text in it
 * @author dimachig@gmail.com
 * @since 24.07.2020
 * @version 1.00
 */
public class Article {
    /**
     * @param origin - Original text
     * @param line - Searched words
     * @return true or false
     */
    public static boolean generateBy(String origin, String line) {
        String[] originText = origin.split("\\p{Punct}");
        String[] lineText = line.split("\\p{Punct}");
        HashSet<String> result = new HashSet<>(Arrays.asList(originText));
        return result.containsAll(Arrays.asList(lineText));
    }
}
