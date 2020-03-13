package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point first = new Point(1, 1);
        Point second = new Point(4, 12);
        Point third = new Point(7, 22);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(1.4999999999998475));
    }
    @Test
    public void whenNoExist() {
        Point first = new Point(2, 2);
        Point second = new Point(4, 4);
        Point third = new Point(2, 2);
        Triangle triangle = new Triangle(first, second, third);
        double result = triangle.area();
        assertThat(result, is(-1.0));
    }
}
