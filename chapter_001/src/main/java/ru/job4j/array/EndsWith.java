package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int temp = word[0];
        word[0] = word[word.length-2];
        temp = word[1];
        word[1] = word[word.length-1] ;

        for (int index = 0; index < word.length; index++) {
            if (post[index] != word[index]) {
                return false;
            }
        }
        return result;
    }
}