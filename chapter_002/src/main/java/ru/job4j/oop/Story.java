package ru.job4j.oop;
/**
 * Story task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 11.03.2020
 **/
public class Story {
    /**
     * Сказака о Красной Шапочке , Пионере и Волке
     */
    public static void main(String[] args) {
        Pioneer petya = new Pioneer();
        Girl girl = new Girl();
        Wolf1 wolf = new Wolf1();

        girl.help(petya);
        wolf.eat(girl);
        petya.kill(wolf);
    }
}