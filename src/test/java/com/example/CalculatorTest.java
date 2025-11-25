package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void addTest() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void subtractTest() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    void multiplyTest() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void divideTest() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.divide(6, 3));
    }

    @Test
    void divideByZeroTest() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
    }

    @Test
    void divideNegativeNumbersTest() {
        Calculator calculator = new Calculator();
        assertEquals(-2.0, calculator.divide(6, -3));
        assertEquals(2.0, calculator.divide(-6, -3));
        assertEquals(-2.0, calculator.divide(-6, 3));
    }

    @Test
    void divideWithDecimalResultTest() {
        Calculator calculator = new Calculator();
        assertEquals(2.5, calculator.divide(5, 2));
    }

    @Test
    void largeNumberDivisionTest() {
        Calculator calculator = new Calculator();
        assertEquals(1000000.0, calculator.divide(10000000, 10));
    }
}