package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    public void manWeight() {
        double in = 182;
        double expected = 94.3;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
    @Test
    public void womanWeight() {
        double in = 169;
        double expected = 67.85;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }
}


