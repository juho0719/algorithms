package com.juho.leetCode.jenuaryLeetCodingChallenge.day08;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CheckIfTwoStringArraysAreEquivalentTest {

    CheckIfTwoStringArraysAreEquivalent ctsaae = new CheckIfTwoStringArraysAreEquivalent();

    @Test
    public void checkIfTwoStringArraysAreEquivalent01Test() {
        String[] word01 = {"ab", "c"};
        String[] word02 = {"a", "bc"};
        assertEquals(ctsaae.arrayStringsAreEqual(word01, word02), true);

        String[] word11 = {"a", "cb"};
        String[] word12 = {"ab", "c"};
        assertEquals(ctsaae.arrayStringsAreEqual(word11, word12), false);

        String[] word21 = {"abc", "d", "defg"};
        String[] word22 = {"abcddefg"};
        assertEquals(ctsaae.arrayStringsAreEqual(word21, word22), true);
    }
}