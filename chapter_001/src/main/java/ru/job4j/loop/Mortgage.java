package ru.job4j.loop;

public class Mortgage {
    public int year(double amount, int salary, double percent) { // переменные метода
        int year = 0;  // счетчик годов
        while (amount > 0) { // пока долг имеется , цикл вертится
            amount = ((amount + ((amount / 100) * percent)) - salary); // расчет долга по ипотеке
            year++; // пока имеется задолжность, накидываем годик

        }  // как только долг будет равен нулю, всё наконец то закончится.

        return year;

    }
}
