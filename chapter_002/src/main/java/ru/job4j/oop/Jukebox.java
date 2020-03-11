package ru.job4j.oop;

/**
 * Jukebox task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @since 11.03.2020
 **/

public class Jukebox {
    /**
     * @param position
     * Заказываем музыку
     * Вызов метода с аргументами
     */
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюжи");
        }
        if (position == 2) {
            System.out.println("Спокойной ночи");
        }
        if (position != 1 && position != 2) {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox songer = new Jukebox();
        songer.music(1);
        songer.music(2);
        songer.music(42);
    }
}