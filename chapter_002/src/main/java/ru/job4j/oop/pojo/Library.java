package ru.job4j.oop.pojo;

/**
 * Библиотека из 4х книг
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 27.03.2020
 **/
public class Library {
    public static void main(String[] args) {
        Book book = new Book("Винни Пух", 42);
        Book book1 = new Book("Clean code", 33);
        Book book2 = new Book("Война и Мир", 6533);
        Book book3 = new Book("Властелин колец", 992);

        Book[] books = new Book[4];

        books[0] = book;
        books[1] = book1;
        books[2] = book2;
        books[3] = book3;

        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPagenum());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getName() + " - " + bk.getPagenum());
        }
        for (int index = 0; index < books.length; index++) {
            if (books[index].equals(book1)) {
                System.out.println("Clean code");

            }
        }
    }
}
