package ru.job4j.BOOK;

public class BeerSong {
    public static void main(String []args){
        int beerNum = 99; //Начальное кол- во бутылок
        String word = "Бутылок "; // Назначаем слово

        while (beerNum > 0) { //Цикл пока продолжается покабцтылок больше 0

            if (beerNum == 1){ //Когда останется 1 бутылка
                word = "Бутылка"; //используется слово Бутылка
            } //Закрываем условие
            System.out.println(beerNum + " " + word + "Пива на стене");
            System.out.println(beerNum + " " + word + "пива.");
            System.out.print("Возьми одну.");
            System.out.println("Пусти по кругу.");
                beerNum = beerNum - 1; // Каждый цикл уменьшаем на 1 бутылку
                if (beerNum > 0){
            System.out.println(beerNum + " " + word + "Пива на стене");
        }else{
                    if (beerNum==0) //если осталось 0 бутылок, то вывести нижнюю строку
                    System.out.println("Нет бутылок пива на стене");
           } //Конец  else
        } //Конец цикла while
    } //Конец метода main
} //Конец класса
