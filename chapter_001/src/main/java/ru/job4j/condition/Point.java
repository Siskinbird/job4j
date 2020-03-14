package ru.job4j.condition;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * Class Класс для вычисления расстояния между двумя точками в двух и трёх мерном пространстве
 * @author Dmitry Chizhov dimachig@gmail.com
 * @since 14.03.20
 */

public class Point {
    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;
    private int y;
    private int z;
    /**
     * Конструктор, который принимает два параметра.
     * @param first
     * @param second
     */
   public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }
    /**
     * Конструктор, который перегружает метод Point
     * @param x
     * @param y
     * @param z
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    /**
     * Метод для поиска расстояния меджу точками в двух мерном пространстве
     * @param that
     * @return
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }
    /**
     * Метод находящий расстояние между точками в трёхмерном пространстве
     * @param that
     * @return
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }
    public static void main(String[] args) {
        Point a = new Point(2, 0, 33);
        Point b = new Point(7, 0, 21);
        double dist = a.distance3d(b);
        System.out.println(dist);
    }
}
