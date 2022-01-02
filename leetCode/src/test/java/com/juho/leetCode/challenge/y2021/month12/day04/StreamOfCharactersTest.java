package com.juho.leetCode.challenge.y2021.month12.day04;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StreamOfCharactersTest {

    @Test
    public void streamOfCharacters01Test() {
        String[] words = {"cd", "f", "kl"};
        StreamOfCharacters streamChecker = new StreamOfCharacters(words);
        assertEquals(false, streamChecker.query('a'));
        assertEquals(false, streamChecker.query('b'));
        assertEquals(false, streamChecker.query('c'));
        assertEquals(true, streamChecker.query('d'));
        assertEquals(false, streamChecker.query('e'));
        assertEquals(true, streamChecker.query('f'));
        assertEquals(false, streamChecker.query('g'));
        assertEquals(false, streamChecker.query('h'));
        assertEquals(false, streamChecker.query('i'));
        assertEquals(false, streamChecker.query('j'));
        assertEquals(false, streamChecker.query('k'));
        assertEquals(true, streamChecker.query('l'));
    }
}