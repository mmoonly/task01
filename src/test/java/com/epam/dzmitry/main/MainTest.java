package com.epam.dzmitry.main;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MainTest {

    @Test
    public void calculateSquare() {
        assertEquals(4.0, Main.calculateSquare(4, 2));
        assertEquals(10.0, Main.calculateSquare(4, 5));
        assertEquals(1.0, Main.calculateSquare(1, 2));
    }

    @Test
    public void calculatePerimeter() {
        assertEquals(12.0, Main.calculatePerimeter(3, 4));
        assertEquals(17.21110255092798, Main.calculatePerimeter(6, 4));
    }
}