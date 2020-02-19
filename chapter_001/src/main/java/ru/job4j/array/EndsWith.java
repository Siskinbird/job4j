package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        for (int index = post.length - 1; index >0; index--) { // индекс равен
            if (post[post.length-1] == word[word.length-1]){ //
                result = true;
                break;
            }
        }return result;
    }
}