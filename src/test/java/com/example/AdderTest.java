package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AdderTest {

    @Test
    void testAddPositiveNumbers() {
        Adder adder = new Adder();
        assertEquals(5, adder.add(2, 3));
    }

    @Test
    void testAddNegativeNumbers() {
        Adder adder = new Adder();
        assertEquals(-5, adder.add(-2, -3));
    }

    @Test
    void testAddPositiveAndNegativeNumbers() {
        Adder adder = new Adder();
        assertEquals(1, adder.add(-2, 3));
    }

    @Test
    void testAddZero() {
        Adder adder = new Adder();
        assertEquals(2, adder.add(2, 0));
    }
}