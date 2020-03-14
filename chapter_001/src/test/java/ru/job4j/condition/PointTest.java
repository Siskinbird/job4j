package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void distance1() {
        Point p1 = new Point(0, 0, 0);
        Point p2 = new Point(13, 86, 47);
        double expected = 98.863;
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.001);

    }
    @Test
    public void distance2() {
        Point p1 = new Point(3, 0, 77);
        Point p2 = new Point(2, 0, 69);
        double expected = 8.062;
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.001);
    }
    @Test
    public void distance3() {
        Point p1 = new Point(0, 11, 32);
        Point p2 = new Point(12, 17, 23);
        double expected = 16.155;
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.001);
    }
    @Test
    public void distance() {
        Point p1 = new Point(33, 45, 42);
        Point p2 = new Point(23, 43, 39);
        double expected = 10.63;
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.001);
    }
    @Test
    public void distance222() {
        Point p1 = new Point(2, 0, 33);
        Point p2 = new Point(7, 0, 21);
        double expected = 13.0;
        double out = p1.distance3d(p2);
        Assert.assertEquals(expected, out, 0.001);
    }
}
