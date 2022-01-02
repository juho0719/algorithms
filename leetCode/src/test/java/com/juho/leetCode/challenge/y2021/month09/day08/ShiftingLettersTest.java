package com.juho.leetCode.challenge.y2021.month09.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ShiftingLettersTest {

    ShiftingLetters sl = new ShiftingLetters();

    @Test
    public void shiftingLetters01Test() {
        String s01 = "abc";
        int[] shifts01 = {3,5,9};
        assertEquals("rpl", sl.shiftingLetters(s01, shifts01));

        String s02 = "aaa";
        int[] shifts02 = {1,2,3};
        assertEquals("gfd", sl.shiftingLetters(s02, shifts02));
    }
}