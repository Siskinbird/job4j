package ru.job4j.oop.io;

import java.util.Scanner;

/**
 * Zero Matches © III: "Rise of thunder"
 * @version 4.20
 * @system request: Intel 286, 12 KByte free space on HDD, 8½ bit video memory , sound blaster.
 * @since 1986 All rights reserved ©
 */
public class Matches {
    private void showMenu() {
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
    }

    public static void main(String[] args) {
        Scanner player1 = new Scanner(System.in);
        new Matches().showMenu();
        int spichki = 11;
        String p1 = "Первый игрок";
        while (spichki > 0) {
            System.out.println(p1 + ", cколько спичек будем брать?");
            int selectP1 = Integer.valueOf(player1.nextLine());
            System.out.println(p1 + " берет " + selectP1 + " спички");
            if (selectP1 > 3 || selectP1 < 1) {
                System.out.println("Не - не - не! Возьмите одну, две или три спички");
                continue;
            }
            System.out.println("--------------------------------------------------------------------------------");
            spichki = spichki - selectP1;
            if (spichki <= 0) {
                System.out.println(p1 + " побеждает! Это была великая битва!");
                break;
            }
            System.out.println("Осталось всего " + spichki + " спичек");
            System.out.println("--------------------------------------------------------------------------------");
            p1 = p1.equals("Первый игрок") ? "Второй игрок" : "Первый игрок";
        }
    }
}