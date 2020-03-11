package ru.job4j.array;
  /**
   * EndsWith task.
   * @author  Chizhov Dmitry dima@chig@gmail.com
   * @version 1.00
   * @since 25.02.2020
  **/
public class EndsWith {
      /**
       * @param word
       * @param post
       * @return result
       * Слово заканчивается на ...
       */
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        for (int i = post.length - 1; i > 0; i--) {
            if (post[post.length - i] != word[word.length - i]) {
                result = false;
                break;
            }
        } return result;
    }
}