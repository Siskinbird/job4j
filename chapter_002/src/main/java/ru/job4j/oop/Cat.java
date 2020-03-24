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
        Cat gav = new Cat();
        Cat black = new Cat();

        gav.giveNick("Гав's");
        System.out.println("There are " + (gav.name) + " food.");
        gav.eat("kotleta");
        gav.show();
        black.giveNick("Ночка's");
        System.out.println("There are " + (black.name) + " food.");
        black.eat("fish");
        black.show();

    }
}

