package ru.job4j.oop.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    /**
     * Ответы на все вопросы
     * @param args
     * Возвращает результат работы великого разума.
     */
    public static void main(String[] args) {
        Scanner question = new Scanner(System.in);
        System.out.print("Я великий Солнцеликий. Я код вселенной, её начало и закат, подумай хорошенько, что ты хочешь узнать? ");
        String input = question.nextLine();
        int answer = new Random().nextInt(3);
        if (answer == 1) {
            System.out.println("Игарь! Прекращай, на риторические вопросы ответов не существует!");
        }
        if (answer == 2) {
            System.out.println("Тобi конец, текай с городу");
        }
        if (answer == 3) {
            System.out.println("Ору с тебя как корень мандрагоры");
        }
        if (answer == 0) {
            System.out.println("Ну ты чего наделал то?");
        }
    }
}
