package ru.job4j.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
       if(((ab+bc)>ac)&&(ab<(bc+ac))&&(bc<(ac+ab)));
       else return false;
       return true;
       // Вот что происходит когда немного почитаешь)
    }
}


