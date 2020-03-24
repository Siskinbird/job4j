package ru.job4j.oop;

public class Profession {
    public String name;
    public String surname;
    public String education;
    public double birthday;

public String getName(String name) {
}
public String getName(String surname) {

}
public String getEducation(String education) {

}
public  double getBirthday(double birthday) {

}

}


//1. Создайте базовый класс Profession - вынесите туда все общие поля (name, surname, education, birthday)
// и метод (get методы на поля (public String getName()))
//2. Создайте классы Engineer, Doctor, унаследовав их от Profession;
//3. Создайте наследников от классов Engineer, Doctor.
//4. Добавьте новые поля в наследниках и так же методы. Это поля и методы, должны отображать особенность класса.
//
//При реализации новых полей и методов можете подключать фантазию.
//
//Примеры методов:
//
//Метод public Diagnose heal(Pacient pacient) {} из класса Doctor возвращает диагноз.
//
//Метод public getName из класса Profession (т.е. общий для всех унаследованных классов) возвращает имя при вызове его
// для любого класса Doctor, Teacher, Engineer.
//
//Классы Diagnose и т.д. Вы должны создать сами.
//
//Важно внутри методы ничего не должны делать.  Оставь эти методы пустые!
//Что не нужно делать:
//1. Здесь не надо использовать Scanner, System.in, System.out.println.
//2. В программе не должно быть ввода и вывода данных.
//3. Не надо создавать метод public static void main(String[] args) - так вы занимаетесь ручным тестированием. В курсе
// используется только автоматическое тестирование за счет JUnit.