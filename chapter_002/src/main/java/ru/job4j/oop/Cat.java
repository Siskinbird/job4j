package ru.job4j.oop;

/**
 * Тренеруемся на кошках
 */

public class Cat {

    private String food;
    private String name;
    /**
     * Здесь мы создаем поле класса Cat, которое называется food.
     */

    public void show() {
        System.out.println(this.food);
    }
    /**
     * Здесь мы создаем поле класса Cat, которое называется name.
     */
    public void name() {
        System.out.println(this.name);
    }
    /**
     * Чтобы выполнить метод объекта, нужно обратиться к имени переменой объекта и через точку написать необходимый метод.
     */
    public void giveNick(String nick) {
        this.name = nick;
    }
    /**
     * Чтобы выполнить метод объекта, нужно обратиться к имени переменой объекта и через точку написать необходимый метод.
     */
    public void eat(String meat) {
        this.food = meat;
    }
    /**
     * Main
     */
    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Овчарка");
        gav.show();
        System.out.println("There are gav's nick.");
        gav.name();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Ночка");
        black.show();
        System.out.println("There are Black's nick.");
        black.name();

    }
}

