package com.juho.leetCode.challenge.month08.day27;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LongestUncommonSubsequenceIITest {

    LongestUncommonSubsequenceII lus2 = new LongestUncommonSubsequenceII();

    @Test
    public void longestUncommonSubsequenceII01Test() {
        String[] strs01 = {"aba", "cdc", "eae"};
        assertEquals(3, lus2.findLUSlength(strs01));

        String[] strs02 = {"aaa", "aaa", "aa"};
        assertEquals(-1, lus2.findLUSlength(strs02));
    }
}