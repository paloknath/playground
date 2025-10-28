package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the LetterCounter class.
 */
public class LetterCounterTest {

    private final LetterCounter counter = new LetterCounter();

    @Test
    public void testCountLettersSimpleWord() {
        assertEquals(5, counter.countLetters("hello"));
        assertEquals(5, counter.countLetters("world"));
    }

    @Test
    public void testCountLettersWithNumbers() {
        assertEquals(4, counter.countLetters("Java123"));
        assertEquals(4, counter.countLetters("abc123def"));
    }

    @Test
    public void testCountLettersWithSpecialCharacters() {
        assertEquals(8, counter.countLetters("test-word"));
        assertEquals(5, counter.countLetters("hello!"));
        assertEquals(5, counter.countLetters("@world"));
    }

    @Test
    public void testCountLettersEmptyString() {
        assertEquals(0, counter.countLetters(""));
    }

    @Test
    public void testCountLettersNull() {
        assertEquals(0, counter.countLetters(null));
    }

    @Test
    public void testCountLettersOnlyNumbers() {
        assertEquals(0, counter.countLetters("12345"));
    }

    @Test
    public void testCountLettersOnlySpecialCharacters() {
        assertEquals(0, counter.countLetters("!@#$%"));
    }

    @Test
    public void testCountLettersMixedCase() {
        assertEquals(5, counter.countLetters("HeLLo"));
        assertEquals(9, counter.countLetters("JavaWorld"));
    }
}
