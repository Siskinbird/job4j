package ru.job4j.oop;

/**
 * Тренеруемся на кошках
 */

public class DummyDic {
    public String engToRus(String eng) {
        String say = "Неизвестное слово. " + eng;
        return say;
       }
   public static void main(String[] args) {
       DummyDic say = new DummyDic();
       String eng = say.engToRus("переменная");
       System.out.println(eng);
    }
}
