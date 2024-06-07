package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private Calculator calculator;
    //failed
    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(5, 5), 0);
        assertEquals(0, calculator.add(-2, 2), 0);
        assertEquals(-3, calculator.add(-1, -2), 0);
    }

    @Test
    public void testSubtract() {
        assertEquals("10 - 5 should equal 5", 5, calculator.subtract(10, 5), 0);
        assertEquals("-2 - 2 should equal -4", -4, calculator.subtract(-2, 2), 0);
        assertEquals("-1 - -2 should equal 1", 1, calculator.subtract(-1, -2), 0);
    }

    @Test
    public void testMultiply() {
        assertEquals("10 * 5 should equal 50", 50, calculator.multiply(10, 5), 0);
        assertEquals("-2 * 2 should equal -4", -4, calculator.multiply(-2, 2), 0);
        assertEquals("-1 * -2 should equal 2", 2, calculator.multiply(-1, -2), 0);
    }

    @Test
    public void testDivide() {
        assertEquals("10 / 5 should equal 2", 2, calculator.divide(10, 5), 0);
        assertEquals("-2 / 2 should equal -1", -1, calculator.divide(-2, 2), 0);
        assertEquals("-1 / -2 should equal 0.5", 0.5, calculator.divide(-1, -2), 0);
    }
}
