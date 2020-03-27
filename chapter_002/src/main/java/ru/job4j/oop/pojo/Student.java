package ru.job4j.oop.pojo;

import java.util.Date;

/**
 * Пример модели данных класса Студент
 * @author  Chizhov Dmitry dima@chig@gmail.com
 * @version 1.00
 * @since 27.03.2020
 **/

public class Student {
    /**
     * Поля класса
     */
    private String name;
    private String surname;
    private String secondname;
    private Date reciept;
    /**
     * Генерация аксессоров
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /**
     * Генерация аксессоров
     **/
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    /**
     * Генерация аксессоров
     **/
    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname;
    }
    /**
     * Генерация аксессоров
     **/
    public Date getReciept() {
        return reciept;
    }

    public void setReciept(Date reciept) {
        this.reciept = reciept;
    }


}

