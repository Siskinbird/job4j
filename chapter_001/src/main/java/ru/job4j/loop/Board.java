package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int i = 0; i < height; i++) {// условие проверки, что писать пробел или X
            for (int j = 0; j < width; j++) { // условие проверки, что писать пробел или X
                if ((i + j) % 2 == 0) { // Сумма индектов делится без остатка на 2

                    System.out.print("X"); //если тру то Х

                } else { // Если фолс то пробел

                    System.out.print(" ");
                }
            }
            System.out.println(); // добавляем перевод на новую строку.
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(7, 5);
    }
}