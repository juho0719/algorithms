package com.juho.leetCode.challenge.y2021.month01.day22;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DetermineIfTwoStringsAreCloseTest {

    DetermineIfTwoStringsAreClose ditsac = new DetermineIfTwoStringsAreClose();

    @Test
    public void determineIfTwoStringsAreClose01Test() {
        String word01 = "abc";
        String word02 = "bca";
        assertEquals(ditsac.closeStrings(word01, word02), true);

        String word11 = "a";
        String word12 = "aa";
        assertEquals(ditsac.closeStrings(word11, word12), false);

        String word21 = "cabbba";
        String word22 = "abbccc";
        assertEquals(ditsac.closeStrings(word21, word22), true);

        String word31 = "cabbba";
        String word32 = "aabbss";
        assertEquals(ditsac.closeStrings(word31, word32), false);
    }
}