package ru.job4j.oop;

/**
 * Тренеруемся на кошках
 */

public class DummyDic {
    public String engToRus() {
        String say = "Andatra";
        return say;
       }

   public static void main(String[] args) {
       DummyDic say = new DummyDic();
       String eng = say.engToRus();

       System.out.println("Неизвестное слово " + eng);
    }
}
