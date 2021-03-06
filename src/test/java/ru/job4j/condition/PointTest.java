package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when32to12then2() {
        double expected = 2;
        int x1 = 3;
        int y1 = 2;
        int x2 = 1;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to33then2dot82() {
        double expected = 2.82;
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to02then1() {
        double expected = 1;
        int x1 = 0;
        int y1 = 1;
        int x2 = 0;
        int y2 = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}