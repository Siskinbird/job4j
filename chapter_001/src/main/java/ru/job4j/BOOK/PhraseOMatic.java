package ru.job4j.BOOK;

import ru.job4j.condition.Max;

public class PhraseOMatic {//открываем класс
    public static void main (String[]args){            //описываем метод
    String[] wordListOne = { "Постоянный", "Взвинченный", "Не работающий", "Криворукий", "Мягкотелый", "Не обращающий внимания",
    "Булевый", "Не логичный", "Зубодробящщий", "Навязчивый","Аморфный", "Гендерный", "Проникающий", "Сверхмассивный", "Тугоплавкий"
    , "Поддирижаберный"};
    String[] wordListTwo = {" мозгозависимый", " пчеловодивый", " урбанистический", " помёт шмеля", " pуботычинский",
            " олигофренический", " бабуинолюбивый", " травмированный", " писякот", " использованный с выгодой", " потерявший надежду",
            "сильно сиплый", " щербато-злоборожий"," антарктически холодный", " слегкапидорковатый"
    };
    String[] wordListThree={" процесс", " талант", " пергедроль", " мутаген", " зверобой"," шкуроед", " портал", " мастер"," больной ублюдок",
    " отец питонов"," мать дуболомов", " анархист"," малекуль"," животное"
    };
    //вычисляем колво слов в каждом списке
    int oneLenght = wordListOne.length;
    int twoLenght = wordListTwo.length;
    int threeLenght = wordListThree.length;
    //Генерируем 3 случайных числа
    int rand1 = (int)(Math.random()*oneLenght);
    int rand2 = (int)(Math.random()*twoLenght);
    int rand3 = (int)(Math.random()*threeLenght);
    //Строим фразу
        String phrase = wordListOne[rand1]+""+wordListTwo[rand2]+""+wordListThree[rand3];
        //Выводим фразу на экран
        System.out.println("Всё, что нам нужно, - это "+ phrase);
        }
}
