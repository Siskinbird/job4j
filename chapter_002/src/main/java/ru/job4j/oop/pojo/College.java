package ru.job4j.oop.pojo;
import java.util.Date;
/**
 * College task.
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 27.03.2020
 **/

public class College {
    /**
     * Создаём объект Student и заполняем поля через set.
     */
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Чижов ");
        student.setName("Дмитрий ");
        student.setSecondname("Олегович ");
        student.setReciept(new Date());
        System.out.println("Студент: " + (student.getSurname()) + student.getName() + (student.getSecondname()) + System.lineSeparator() + "Зачислен: " + student.getReciept());
    }
}
