package com.juho.leetCode.challenge.y2022.month03.day18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters rdl = new RemoveDuplicateLetters();

    @Test
    public void removeDuplicateLetters01Test() {
        String s01 = "bcabc";
        assertEquals("abc", rdl.removeDuplicateLetters(s01));

        String s02 = "cbacdcbc";
        assertEquals("acdb", rdl.removeDuplicateLetters(s02));
    }
}