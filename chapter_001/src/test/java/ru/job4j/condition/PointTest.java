package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance1() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double expected = 2.0;
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.001);

    }
    @Test
    public void distance2() {
        int x1 = 3;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        Point p1 = new Point(3, 0);
        Point p2 = new Point(2, 0);
        double expected = 1.0;
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 0.001);
    }
    @Test
    public void distance3() {
        int x1 = 0;
        int y1 = 11;
        int x2 = 0;
        int y2 = 17;
        Point p1 = new Point(0, 11);
        Point p2 = new Point(0, 17);
        double expected = 6.0;
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 7);
    }
    @Test
    public void distance() {
        int x1 = 2;
        int y1 = 0;
        int x2 = 7;
        int y2 = 0;
        Point p1 = new Point(2, 0);
        Point p2 = new Point(7, 0);
        double expected = 5.0;
        double out = p1.distance(p2);
        Assert.assertEquals(expected, out, 6);
    }
}
