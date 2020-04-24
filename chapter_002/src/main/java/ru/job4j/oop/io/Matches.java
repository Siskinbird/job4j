package ru.job4j.oop.io;

import java.util.Scanner;

/**
 * Zero Matches © III: "Rise of thunder"
 * @version 4.20
 * @system request: Intel 286, 12 KByte free space on HDD, 8½ bit video memory , sound blaster.
 * @since 1986 All rights reserved ©
 */
public class Matches {

    public static void main(String[] args) {
        Scanner player1 = new Scanner(System.in);
        Scanner player2 = new Scanner(System.in);
        System.out.println("Zero Matches III: \"Rise of thunder\"");
        System.out.println("* * *");
        System.out.println("Введите с клавиатуры сколько спичек вы желаете отнять от 1 до 3");
        System.out.println("* * *");
        System.out.println("Побеждает игрок после которого на столе не останется ни одной спички");
        System.out.println("* * *");
        System.out.println("1. Беру одну спичку!");
        System.out.println("2. Беру две спички!");
        System.out.println("3. Беру три спички!");
        System.out.println("* * *");
        int spichki = 11;
        while (spichki > 0) {

            System.out.println("Игрок 1. Сколько спичек будем брать?");
            int selectP1 = Integer.valueOf(player1.nextLine());

            System.out.println("Игрок 1 берет " + selectP1 + " спички");
            System.out.println("--------------------------------------------------------------------------------");
            if (selectP1 == 1) {
                spichki = spichki - selectP1;
                System.out.println("Осталось всего " + spichki + " спичек");
                System.out.println("--------------------------------------------------------------------------------");
            }
            if (selectP1 == 2) {
                spichki = spichki - selectP1;
                System.out.println("Осталось всего " + spichki + " спичек");
                System.out.println("--------------------------------------------------------------------------------");
            }
            if (selectP1 == 3) {
                spichki = spichki - selectP1;
                System.out.println("Осталось всего " + spichki + " спичек");
                System.out.println("--------------------------------------------------------------------------------");
            }
            if (selectP1 == 0) {
                System.out.println("Не - не - не! Возьмите одну, две или три спички");
            }
            if (spichki == 0) {
                System.out.println("Игрок 1 побеждает! Это была великая битва!");
            }
            System.out.println("Игрок 2. Сколько спичек будем брать?");

            int selectP2 = Integer.valueOf(player2.nextLine());

            System.out.println("Игрок 2 берет " + selectP2 + " спички");
            System.out.println("--------------------------------------------------------------------------------");
            if (selectP2 == 2) {
                spichki = spichki - selectP2;
                System.out.println("Осталось всего " + spichki + " спичек");
                System.out.println("--------------------------------------------------------------------------------");
            }
            if (selectP2 == 3) {
                spichki = spichki - selectP2;
                System.out.println("Осталось всего " + spichki + " спичек");
                System.out.println("--------------------------------------------------------------------------------");
            }
            if (selectP2 == 0) {
                System.out.println("Не - не - не! Возьмите одну, две или три спички");
            }
            if (spichki == 0) {
                System.out.println("Игрок 2 побеждает! Это была великая битва!");
            }
        }
    }
}