package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberAdderTest {

    @Test
    void testAddPositiveNumbers() {
        NumberAdder adder = new NumberAdder();
        assertEquals(5, adder.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        NumberAdder adder = new NumberAdder();
        assertEquals(-5, adder.add(-2, -3));
    }

    @Test
    void testAddPositiveAndNegativeNumbers() {
        NumberAdder adder = new NumberAdder();
        assertEquals(1, adder.add(3, -2));
    }

    @Test
    void testAddZero() {
        NumberAdder adder = new NumberAdder();
        assertEquals(5, adder.add(5, 0));
    }
}